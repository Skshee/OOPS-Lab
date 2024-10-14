import java.util.Scanner;

class Counter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        String str[]=s.split(" ");
        int count=0;
        for (int w = 0; w < s.length(); w++) {
            if (s.charAt(w) == 'a' || s.charAt(w) == 'e' || s.charAt(w) == 'i' || s.charAt(w) == 'o'
                    || s.charAt(w) == 'u') {
                count++;
            }
        }
        System.out.println("Total words :"+str.length);
        System.out.println("The total number of characters in the string ="+(1+s.length()-str.length));
        System.out.println("Total Vowels :"+count);
        sc.close();
    }
}
