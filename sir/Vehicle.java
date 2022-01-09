public class Vehicle {
    int noOfWheels;
    String color;
    String price;
    String modal;

    public Vehicle()
    {
        color="red";
        price="1000000";
   System.out.println("constructor");
    }
    public Vehicle(int n,String c)
    {
       noOfWheels=n;
       color=c;
    }

    public void display() {
     System.out.println("hello");
    }
    public static void drive()
    {
      System.out.println("driving...");
    }
    public void brake()
    {
        System.out.println("brake....");
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        
        drive();
    }

}
