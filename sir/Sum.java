package sir;

public class Sum {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10==55

        //count=11 sum=55  11<11=false
            int count=1;
            int sum= 0;

            while (count<11) 
            {
                sum=sum+count;
                count=count+1;
                
            }
            System.out.println(sum);
         

    }
}
