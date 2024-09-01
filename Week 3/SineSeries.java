import java.util.Scanner;
class SineSeries
{

   public static void main(String[] args)      

   {

       Scanner sc = new Scanner(System.in);    

       

       System.out.print("Enter the value of x: ");
       double x = sc.nextDouble();             
       System.out.println("Enter the number of terms:");
       int n = sc.nextInt();
       double Sum = 0;    
       for(int i=0;i<n;i++)      
        {
            Sum += (Math.pow(-1,i)*Math.pow(x,2*i+1))/factorial(2*i+1); 
        }
    System.out.println("sin(x) = "+Sum); 
 }

   

   static double factorial(int n) 
{

    double fact=1;
    for(int i=2;i<=n;i++)
    {
    fact = fact*i;      
    }
    return fact;        
}
}

