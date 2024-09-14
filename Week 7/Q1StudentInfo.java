import java.util.Scanner;

class Q1StudentInfo{
    String name;
    int ID;
    static String college="MIT";
    Q1StudentInfo(String name,int ID){
        this.name=name;
        this.ID=ID;
    }
    void display_details(){
        System.out.println("The name of the student is: "+name);
        System.out.println("The name of the college is: "+college);
        System.out.println("The ID is: "+ID);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter the ID of the student: ");
        int ID = sc.nextInt();
        Q1StudentInfo stud = new Q1StudentInfo(name, ID);
        stud.display_details();
        sc.close();
    }
}