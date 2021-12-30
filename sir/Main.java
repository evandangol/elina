public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.Price = "100000";
        c.country = "Japan";
        c.modal = "Toyota";

        c.display();

        Sara mysara = new Sara();
        String s1 = "Enemy's ahead";
        String s2 = "fall back to safe zone";
        mysara.voices[0] = s1;
        mysara.voices[1] = s2;

        for (int i = 0; i <= 1; i++) {
            System.out.println("sara says : " + mysara.voices[i]);
        }

        Human me= new Human();
        Human you = new Human();
        Human ram= new Human();
        Human Michael= new Human();
        Pen mypen= new Pen();
        Animal mylovelyanimal= new Animal();

    }
}
