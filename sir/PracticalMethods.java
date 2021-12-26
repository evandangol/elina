public class PracticalMethods {
    public static void main(String[] args) {
        int num = 13;
        IsPrime(num);
    }

    public static void IsPrime(int num) {
        boolean prime = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    // 1 2 3 7 11 13 divisible by 1 or itself only
    // 6 not prime
}
