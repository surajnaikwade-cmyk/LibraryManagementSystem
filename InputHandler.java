package LibraryManagementSystem;

import java.util.Scanner;

public class InputHandler {

    private Scanner sc;

    public InputHandler() {
        sc = new Scanner(System.in);
    }

    public int readInt(String message) {

        while (true) {
            System.out.print(message);

            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            }

            System.out.println("Invalid input! Enter a number.");
            sc.nextLine();
        }
    }

    public String readString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public void close() {
        sc.close();
    }
}

