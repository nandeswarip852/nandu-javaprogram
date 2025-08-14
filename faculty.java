import java.util.ArrayList;
import java.util.Scanner;

public class FacultyManagement {
    private static ArrayList<Faculty> facultyList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Faculty Management System ---");
            System.out.println("1. Add Faculty");
            System.out.println("2. Display All Faculty");
            System.out.println("3. Search Faculty by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addFaculty();
                    break;
                case 2:
                    displayAllFaculty();
                    break;
                case 3:
                    searchFacultyById();
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void addFaculty() {
        System.out.print("Enter Faculty ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Faculty Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        facultyList.add(new Faculty(id, name, department));
        System.out.println("Faculty added successfully!");
    }

    private static void displayAllFaculty() {
        if (facultyList.isEmpty()) {
            System.out.println("No faculty records found.");
        } else {
            System.out.println("\nList of Faculty:");
            for (Faculty faculty : facultyList) {
                System.out.println(faculty);
            }
        }
    }

    private static void searchFacultyById() {
        System.out.print("Enter Faculty ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Faculty faculty : facultyList) {
            if (faculty.getId() == id) {
                System.out.println("Faculty Found: " + faculty);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Faculty with ID " + id + " not found.");
        }
    }
}
