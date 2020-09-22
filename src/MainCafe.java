import Area.Cafe;

public class MainCafe {

    public static void main(String[] args) {
        System.out.println("Welcome to " + Cafe.displayCafeName("Cafe Firenze") +
                "\n" + "Working hours: " + Cafe.cafeIsOpen() + "-" + Cafe.cafeIsClose());


    }
}
