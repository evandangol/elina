

public class Ebool {
    public static void main(String[] args) {
        boolean flag = true;
        boolean flag1 = false;

        // 5>6
        boolean exp = 5 > 6;
        System.out.println(exp); // false
        boolean exp1 = 5 < 6;
        System.out.println(exp1); // true

        // 5>6 ||(pipe sign or) 7<3
        // false //false
        boolean exp2 = 5 > 6 || 7 < 3;
        System.out.println("exp2: " + exp2);

        boolean exp3 = 5 < 6 || 7 < 3;
        System.out.println("exp3: "+ exp3);
        boolean exp4=5<6 || 7>3;
        System.out.println("exp4: "+ exp4);


        boolean exp5=5<6 && 7>3;
        System.out.println("exp5: " + exp5);

        boolean exp6=5>6 && 7>3;
        System.out.println("exp6: "+ exp6);
    }
}
