import java.util.Scanner;

interface Shape{
    double Area();
}

class Rectangle implements Shape{
    double lenght;
    double breadth;
    double area;
    Rectangle(double lenght,double breadth)
    {
        this.lenght=lenght;
        this.breadth=breadth;
    }
    
    public double Area(){
        return lenght*breadth;
    }
}

class Circle implements Shape{
    double radius;
    Circle(double radius)
    {
       this.radius=radius;
    }
    
    public double Area(){
        return 3.14*radius*radius;
    }
}

class Square implements Shape{
    double side;
    Square(double side)
    {
       this.side=side;
    }
    
    public double Area(){
        return side*side;
    }
}

class Triangle implements Shape{
    double base;
    double height;
    Triangle(double base,double height)
    {
       this.base=base;
       this.height=height;
    }
    
    public double Area(){
        return 0.5*base*height;
    }
}

class Q3Areas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght and breadth of the rectangle:");
        double lenght = sc.nextDouble();
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(lenght, breadth);
        System.out.println("The area of the rectangle is :"+r.Area());

        System.out.print("Enter radius of the circle:");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("The area of the circle is:"+c.Area());

        System.out.println("Enter the side of the square");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("The area of the circle is:"+s.Area());

        System.out.println("Enter the base and height of the triangle");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle t = new Triangle(base, height);
        System.out.println("The area of the circle is:"+t.Area());
    }
}
