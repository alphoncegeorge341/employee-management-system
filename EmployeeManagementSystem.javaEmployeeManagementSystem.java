import java.util.Scanner;

public class EmployeeManagementSystem {

    static String[] names = new String[100];
    static int[] employeeIds = new int[100];
    static double[] salaries = new double[100];
    static int employeeCount = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    if (employeeCount < 100) {

                        System.out.print("Enter employee ID: ");
                        employeeIds[employeeCount] = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter employee name: ");
                        names[employeeCount] = input.nextLine();

                        System.out.print("Enter employee salary: ");
                        salaries[employeeCount] = input.nextDouble();

                        employeeCount++;

                        System.out.println("Employee added successfully.");

                    } else {
                        System.out.println("Employee limit reached.");
                    }
                    break;

                case 2:
                    System.out.println("\n===== EMPLOYEE LIST =====");

                    if (employeeCount == 0) {
                        System.out.println("No employees registered.");
                    } else {

                        for (int i = 0; i < employeeCount; i++) {
                            System.out.println(
                                "ID: " + employeeIds[i] +
                                " | Name: " + names[i] +
                                " | Salary: " + salaries[i]
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < employeeCount; i++) {

                        if (employeeIds[i] == searchId) {

                            System.out.println("\nEmployee Found");
                            System.out.println("ID: " + employeeIds[i]);
                            System.out.println("Name: " + names[i]);
                            System.out.println("Salary: " + salaries[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }
          }
