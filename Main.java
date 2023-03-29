import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
  {
        int[][] T = new int[10][10]; 
        Random l = new Random();
        int min = -50;
        int max = 50;

        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = l.nextInt(max - min + 1) + min; 
            }
        }

        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}