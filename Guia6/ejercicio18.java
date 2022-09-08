

package Guia6;

//@author Usuario

public class ejercicio18 {

    public static void main(String[] args) {
        int[][] matriz1=new int[4][4];
        int[][] matriz2=new int[4][4];
        
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j]=(int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");       
                
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("["+matriz1[j][i]+"]");
            }
            System.out.println("");
        }

    }


}
