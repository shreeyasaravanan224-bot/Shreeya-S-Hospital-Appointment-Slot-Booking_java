import java.util.Scanner;

public class HospitalAppointment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] slots = {
            "10:00 AM",
            "11:00 AM",
            "12:00 PM",
            "2:00 PM"
        };

        boolean[] booked = new boolean[4];

        System.out.println("HOSPITAL APPOINTMENT BOOKING");

        System.out.println("\nAvailable Slots:");

        for (int i = 0; i < slots.length; i++) {
            if (!booked[i]) {
                System.out.println((i + 1) + ". " + slots[i]);
            }
        }

        System.out.print("\nEnter patient name: ");
        String name = sc.nextLine();

        System.out.print("Choose slot number: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 4) {

            if (!booked[choice - 1]) {

                booked[choice - 1] = true;

                System.out.println("\nAppointment Booked Successfully!");
                System.out.println("Patient: " + name);
                System.out.println("Time: " + slots[choice - 1]);

            } else {
                System.out.println("Slot already booked.");
            }

        } else {
            System.out.println("Invalid slot.");
        }

        sc.close();
    }
}
