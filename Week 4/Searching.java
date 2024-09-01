import java.util.Scanner;

class Searching{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt(); 
        int count=0;
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        int element= sc.nextInt();
        System.out.print("Element has been found at position:");
        for(int i=0;i<size;i++)
        {
            if(arr[i]==element)
            {
                count++;
                System.out.print(+(i+1)+",");
            }
        }
        System.err.println();
        if(count==0)
        {
            System.out.println("Element does not exist in the array:");
        }
        else{
            System.out.println("Element has occured "+count+" times in the array");
        }
        sc.close();
    }
}