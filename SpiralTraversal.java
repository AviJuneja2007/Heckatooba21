import java.util.*;

public class SpiralTraversal {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int a[][]= new int[r][c];

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

        int minr=0;
        int minc=0;

        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int tne=r*c;
        int cnt=0;
        while(cnt<tne){

            //left wall
                for (int i = minr,j=minc; i <= maxr && cnt<tne; i++) {
                  System.out.println(a[i][j]);
                  cnt++;
                }
                minc++;
            //bottom wall
                for (int i= maxr,j=minc; j <= maxc && cnt<tne; j++) {
                    System.out.println(a[i][j]);
                    cnt++;
                }
                maxr--;
            //right wall
                for (int i =maxr,j=maxc; i >=minr && cnt<tne; i--) {
                    System.out.println(a[i][j]);
                    cnt++;
                }
                maxc--;
            //top wall
                 for (int i= minr,j=maxc; j >= minc && cnt<tne; j--) {
                    System.out.println(a[i][j]);
                    cnt++;
                }
                minr++;
        }

        scn.close();
    }
}



