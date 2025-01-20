public class Main {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan",10000,2020,"Green");
        // nissan.make = "Nissan";
        // nissan.price = 10000;
        // nissan.year = 2020;
        // nissan.colour = "Green";
        Car nissan2 = nissan;

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        
    }
}