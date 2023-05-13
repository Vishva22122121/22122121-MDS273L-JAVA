import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[1024];
        int count = 0;

        // Menu-driven program
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Enter a name
                    System.out.print("Enter a name: ");
                    String name = sc.next();
                    if (count == names.length) {
                        System.out.println("Error: Maximum limit of names reached!");
                    } else if (containsName(names, name)) {
                        System.out.println("Error: Name already exists!");
                    } else {
                        names[count] = name;
                        count++;
                        System.out.println("Name added successfully!");
                    }
                    break;
                case 2: // Search for a name
                    System.out.print("Enter a name to search: ");
                    name = sc.next();
                    int index = findName(names, name);
                    if (index == -1) {
                        System.out.println("Name not found!");
                    } else {
                        System.out.println("Name found at index " + index);
                    }
                    break;
                case 3: // Remove a name
                    System.out.print("Enter a name to remove: ");
                    name = sc.next();
                    index = findName(names, name);
                    if (index == -1) {
                        System.out.println("Name not found!");
                    } else {
                        for (int i = index; i < count - 1; i++) {
                            names[i] = names[i + 1];
                        }
                        count--;
                        System.out.println("Name removed successfully!");
                    }
                    break;
                case 4: // Show all names
                    if (count == 0) {
                        System.out.println("No names found!");
                    } else {
                        System.out.println("Names:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(names[i]);
                        }
                    }
                    break;
                case 0: // Exit
                    System.out.println("Exiting...");
                    break;
                default: // Invalid choice
                    System.out.println("Error: Invalid choice!");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }

    // Utility method to check if a name already exists in the array
    private static boolean containsName(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                return true;
            }
        }
        return false;
    }

    // Utility method to find the index of a name in the array
    private static int findName(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                return i;
            }
        }
        return -1;
    }
}
