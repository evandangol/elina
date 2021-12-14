public class Loop {
    public static void main(String[] args) {
        //while for do


        //while example 1
        // int num=1;

        // while(num<10)
        // {
        //     System.out.println(num);
        //     num=num+1; //num++
        // }


         // print even number from 1 to 10

       int num=1; //initialization
        while (num<11) //condition
        {
            int rem=num%2;
            if(rem!=0)
            {
            System.out.println(num);
            }
            else
            {

            }
            num++; //increment/decrement
        }

    }
}

/*

http://www.beginwithjava.com/java/loops/questions.html

Write a program to print numbers from 1 to 10.

Write a program to calculate the sum of first 10 natural number.

Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
Write a program to find the factorial value of any number entered through the keyboard. 

*/