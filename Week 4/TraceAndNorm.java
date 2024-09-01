import java.util.Scanner;
import java.lang.Math;

class TraceAndNorm {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the order of the square matrix:");
       int m = sc.nextInt();
       int[][] arr= new int[m][m];
       double trace=0;
       double sum=0;
       System.out.println("Enter the elements of the matrix:");
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            sum=sum+(arr[i][j]*arr[i][j]);
        }
        trace=trace+arr[i][i];
    } 
    double norm = Math.sqrt(sum);
    System.out.print("Trace is :"+trace);
    System.out.println();
    System.out.print("Norm is :"+norm);
    sc.close();
}
}
