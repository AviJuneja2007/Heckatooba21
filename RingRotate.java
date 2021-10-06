import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a[][]=new int [n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=scn.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int s = scn.nextInt();   //shell no
        int r = scn.nextInt();   //by how much to rotate

        rotateShell(a,s,r);
        display(a);

        scn.close();
    }

    public static void rotateShell(int a[][], int s, int r) {
        int oned[]= onedFromShell(a,s);     //converting the shell to one d array      
        rotate(oned,r); //rotating the one d array as reqd
        shellFromOned(a,s,oned);
    }

    public static int[] onedFromShell(int a[][],int s) {

        int minc=s-1;
        int minr=s-1;
        int maxr=a.length-s;
        int maxc=a[0].length-s;
        int size= 2*(maxr-minr+maxc-minc);  // 2*(maxr-minr+1)+ 2*(maxc-minc+1)-4;  here -4 as 4 repeated elements are negated                 

        int oned[] = new int[size];
       
        //filling the oned array wall wise
        int idx=0;
        //left 
        for(int i=minr ,j=minc;i<=maxr;i++){
            oned[idx]=a[i][j];
            idx++;
        }
        //bottom
        for(int j=minc+1,i=maxr;j<=maxc;j++){
            oned[idx]=a[i][j];
            idx++;
        }
        //right
        for(int i=maxr-1 ,j=maxc;i>=minr;i--){
            oned[idx]=a[i][j];
            idx++;
        }
        //top
        for(int j=maxc-1,i=minr;j>=minc+1;j--){
            oned[idx]=a[i][j];
            idx++;
        }

        return oned;  
    }

    public static void rotate(int oned[],int r) {
        
        r=r%oned.length;
        if(r<0){
            r=r+oned.length;
        }

        reverse(oned,oned.length-1-r,oned.length-1);
        reverse(oned, 0,oned.length-r );
        reverse(oned, 0, oned.length-1);
    }

    public static void reverse(int oned[],int li,int hi) {
        
        int i = li;
        int j= hi;

        while(i<j){
            int temp=oned[i];
            oned[i]=oned[j];
            oned[j]=temp;

            i--;
            j++;
        }
    }

    public static int[] shellFromOned(int a[][],int s,int oned[]) {
        int minc=s-1;
        int minr=s-1;
        int maxr=a.length-s;
        int maxc=a[0].length-s;
        int size= 2*(maxr-minr+maxc-minc);  // 2*(maxr-minr+1)+ 2*(maxc-minc+1)-4;  here -4 as 4 repeated elements are negated                 

        int one[] = new int[size];
       
        //filling the oned array wall wise
        int idx=0;
        //left 
        for(int i=minr ,j=minc;i<=maxr;i++){
           a[i][j]=one[idx];
            idx++;
        }
        //bottom
        for(int j=minc+1,i=maxr ;j<=maxc;j++){
            a[i][j]=one[idx];
            idx++;
        }
        //right
        for(int i=maxr-1 ,j=maxc;i>=minr;i--){
            a[i][j]=one[idx];
            idx++;
        }
        //top
        for(int j=maxc-1 ,i=minr;j>minc;j--){
            a[i][j]=one[idx];
            idx++;
        }
        return one;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}