package lab01_08;
import java.util.Scanner;

public class Gymmembershipmanager {
    private String name;
    private int age;
    private boolean status;
    private int duration;
    private static final double MONTHLY_FEE = 50.0;

    public Gymmembershipmanager(String name, int age, boolean status, int duration) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.duration = duration;
    }

    public double calcuateFee() {
        return status ? MONTHLY_FEE * duration : 0;
    }
    public void displayInfo() {
        System.out.println("\n\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: $" + calcuateFee());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many members you want to add: ");
        int n = scanner.nextInt();

        Gymmembershipmanager[] members = new Gymmembershipmanager[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter status (true for active, false for inactive): ");
            boolean status = scanner.nextBoolean();

            System.out.print("Enter duration in months: ");
            int duration = scanner.nextInt();

            Gymmembershipmanager member = new Gymmembershipmanager(name, age, status, duration);
            members[i] = member;
        }
        System.out.println("\nMember Information:");
        for(Gymmembershipmanager member : members) {
            member.displayInfo();

        }
        scanner.close();
    }
}


