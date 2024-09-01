import java.util.Scanner;
import java.util.Arrays;

class MergeAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizes of the 2 arrays:");
        int size1= sc.nextInt();
        int size2= sc.nextInt();
        int[] arr1= new int[size1];
        int[] arr2= new int[size2];
        System.out.println("Enter the elements of the 1st array:");
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array:");
        for(int i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int size3 = size1+size2;
        int[] arr3= new int[size3];
        
        System.arraycopy(arr1, 0, arr3, 0, size1);
        System.arraycopy(arr2, 0, arr3, size1, size2);

        System.out.println("The elements of the third array are:");
        for(int i=0;i<size3;i++)
        {
            System.out.print(+arr3[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr3);
        System.out.println("The sorted array is:");
        for(int i=0;i<size3;i++)
        {
            System.out.print(+arr3[i]+" ");
        }
        sc.close();
    }
}
