import java.util.Scanner;
class MagicSquare {

    static boolean isMagicSquare(int N,int mat[][])
    {
        int sumD1 = 0,sumD2=0;
        for (int i = 0; i < N; i++)
        {
            sumD1 += mat[i][i];
            sumD2 += mat[i][N-1-i];
        }
        if(sumD1!=sumD2){
            return false;
        }
        for (int i = 0; i < N; i++) {
 
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumD2)
                return false;
        }
        return true;
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the square matrix:");
        int N = sc.nextInt();
        int mat[][]= new int[N][N];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        if(isMagicSquare(N, mat)){
            System.out.println("It is a Magic Square");
        }
        else{
            System.out.println("It is not a Magic Square");
        }
        sc.close();
    }
}

       