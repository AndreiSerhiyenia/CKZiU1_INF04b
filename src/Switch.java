import java.util.Scanner;

public class Switch {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write age");
        String age = scanner.nextLine();
    switch (age) {
        case "zero":
            System.out.println("BORN");
            break;
        case "sewen":
            System.out.println("SCHOOL");
            break;
        case "eleee":
            System.out.println("END SCOOL");
            break;
        default:
            System.out.println("FALSE");
        }
    }
}
