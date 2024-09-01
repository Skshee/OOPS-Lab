import java.util.Scanner;

class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int prime;
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Prime numbers are:");
        for(int i=0;i<size;i++)
        {
            prime=1;
            for(int j=2;j<=(arr[i]/2);j++)
            {
                if(arr[i]%j==0){
                   prime=0;
                   break;
                }
            }
            if(prime==1)
            {
                System.out.print(+arr[i]+" ");
            }
        }
        sc.close();
    }
}
