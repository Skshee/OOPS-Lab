
public class Q2Counter {
    static int count=0;
    Q2Counter(){
        count++;
    }

    int Count(){
        return count;
    }
    public static void main(String[] args) {
        Q2Counter c1 = new Q2Counter();
        Q2Counter c2 = new Q2Counter();
        System.out.println(c1.Count());
        Q2Counter c3 = new Q2Counter();
        Q2Counter c4 = new Q2Counter();
        System.out.println(c4.Count());
    }    
}
