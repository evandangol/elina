import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
    int x=add2(10,10);
    System.out.println(x);
    }
     

    public static  void add1(int a, int b)
    {
      System.out.println(a+b);
    }
    public static int add2(int a, int b)
    {
        return a+b;
    }

    public static int makedouble()
    {
        int num =5;
        num=num*2;
        return num;
    }


    public static void evenodd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    // methods or functions
    // [access modifier ] (static) [return type] [function name] ([optional
    // parameters]){ code }

    // access modifier : public protected private
    // return type : void int String double long
    // function name : anything that starts with a letter
    // parameter : int String double long

    public static void add() {
        int a = 10;
        int b = 5;
        System.out.println(a + b);
    }

    public static void subtract() {
        int a = 10;
        int b = 5;
        System.out.println(a - b);
    }

    public static void multiply() {
        int a = 10;
        int b = 5;
        System.out.println(a * b);
    }

    public static void divide() {
        int a = 10;
        int b = 5;
        System.out.println(a / b);
    }

}
