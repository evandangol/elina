public class Arguments {
    public static void main(String[] args) {
        
        String fname="Elina";
        String lname="Lungeli";

        getFullName(fname, lname);

        String street="Ram street";
        String tole="Balaju";

        String address=getAddress(street, tole);

        System.out.println(address);

        int n=50;
        int dn=makeDouble(n);
        System.out.println(dn);
        getFullName("ram", "sharma");
        getFullName("shyam", "thapa");

        int x=makeDouble(1000);
        int y=makeDouble(5000);

        System.out.println(x);
        System.out.println(y);

    }

    public static void getFullName(String firstName,String lastName)
    {
        System.out.println(firstName+" "+lastName);
    }
    public static String getAddress(String streetName,String toleName)
    {
        return streetName+", "+toleName;
    }
    public static int makeDouble(int num)
    {
       int  doublenum=num+num;
       return doublenum;
    }
}
