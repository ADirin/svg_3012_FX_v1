import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class svg_3012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter distance: ");
        double distance = sc.nextDouble();
        System.out.println("Enter speed: ");
        double speed = sc.nextDouble();
        double time = calTime(distance, speed);
        System.out.println("Time: " + time);
        System.out.println("Welcome to i18N");
        */
        Locale locale = Locale.getDefault();
        System.out.println("Select language 1. for Finnish, 2 for Farsi");
        int lang = sc.nextInt();
        switch (lang) {
            case 1:
                locale = new Locale("fi", "FI");
                break;
            case 2:
                locale = new Locale("fa", "IR");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English.");
                break;
        }

        ResourceBundle rs = ResourceBundle.getBundle("Messages_bundle", locale);
        System.out.println(rs.getString("distance"));
        double distance = sc.nextDouble();
        System.out.println(rs.getString("speed"));
        double speed = sc.nextDouble();
        double time = calTime(distance, speed);
        System.out.println(rs.getString("time") + " " + time);
        System.out.println(rs.getString("message"));

    }

    public static double calTime(double distance, double speed) {
        if (distance < 0 || speed <= 0) {
            return 0; // Avoid negative values or division by zero
        }
        return distance / speed;
    }
}
