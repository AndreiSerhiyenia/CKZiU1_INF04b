import java.util.Scanner;

public class DoWhile {
        public static void main (String [] args) {
           Scanner scanner = new Scanner(System.in);
           int value;
           do {
               System.out.println("Write 5");
               value = scanner.nextInt();

           } while (value!=5);
            System.out.println("Read 5");

            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Write 5");
            int value = scanner.nextInt();
            while (value!= 5) {
                System.out.println("Write 5");
                value = scanner.nextInt();
            }
            System.out.println("You write 5");
            */

    }
    }




