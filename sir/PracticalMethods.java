public class PracticalMethods {
    public static void main(String[] args) {
       IsPalindrome(123);
    }
    // 123 =>321 not palindrome
    // 121 =>121 palindrom

    public static void IsPalindrome(int num) {
        int back = num;
        int reverse = 0;
        int quo = 0;
        
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            quo = num / 10;
            num = quo;
        }
        System.out.println(reverse);
        if (reverse == back) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
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

    public static boolean IsPrimeNum(int num) {
        boolean prime = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void PrintPrimeTo100() {
        for (int i = 1; i <= 100; i++) {
            if (IsPrimeNum(i) == true) {
                System.out.print(i + ", ");
            }
        }
    }

    // 1 2 3 7 11 13 divisible by 1 or itself only
    // 6 not prime
}
