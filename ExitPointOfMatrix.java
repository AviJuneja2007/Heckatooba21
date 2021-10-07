import java.util.*;

public class ExitPointOfMatrix {
    
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
       
        int dir=0;  //0-e 1-s 2-w 3-n 
        int i=0;
        int j=0;

        while(true){

            dir = (dir+ a[i][j])%4;

            switch (dir) {
                case 0: j++;
                    break;
                case 1: i++;
                    break;    
                case 2: j--;
                    break;
                case 3: i--;
                    break;            
            }
            if (i<0) {
                i++;
                break;
            }    
            else if(j<0){
                j++;
                break;
            }
            else if(i==a.length){
                i--;
                break;
            }
            else if(j==a[0].length){
                j--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);

        scn.close();
    }
}
