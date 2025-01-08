import java.util.Scanner;

class Restaurant {
    private String[] menu;
    private String[] tableReservations;
    private String[] customerOrders;
    private int menuCount;
    private int reservationCount;
    private int orderCount;

    Restaurant (int menuCount, int reservationCount, int orderCount) {
        menu = new String[menuCount];
        tableReservations = new String[reservationCount];
        customerOrders = new String[orderCount];
    }
    public void addItemToMenu(String item) {
        if (menuCount < menu.length) {
            menu[menuCount++] = item;
        }else{
            System.out.println("The menu is full");
        }
    }
    public void bookTable(String customerName) {
        if (reservationCount < tableReservations.length) {
            tableReservations[reservationCount++] = customerName;
        } else {
            System.out.println("No tables available");
        }
    }
    public void takeCustomerOrder(String order) {
        if (orderCount < customerOrders.length) {
            customerOrders[orderCount++] = order;
        } else {
            System.out.println("Cannot take more orders");
        }
    }
    public void printMenu() {
        System.out.println("Menu Items:");
        for (int i = 0; i < menuCount; i++) {
            System.out.println(menu[i]);
        }
    }
    public void printTableReservations() {
        System.out.println("Table Reservations:");
        for (int i = 0; i < reservationCount; i++) {
            System.out.println(tableReservations[i]);
        }
    }
    public void printCustomerOrders() {
        System.out.println("Customer Orders:");
        for (int i = 0; i < orderCount; i++) {
            System.out.println(customerOrders[i]);
        }
    }
}

class DayTwentyThree {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant(50,30,25);
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0;
        do {
            System.out.println("1. Add item to menu");
            System.out.println("2. Book a table");
            System.out.println("3. Order your food");
            System.out.println("4. Print the menu");
            System.out.println("5. Print table reservations");
            System.out.println("6. Print customer orders");
            System.out.println("7. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter menu item: ");
                    String a = scanner.nextLine();
                    r1.addItemToMenu(a);
                    break;
                case 2:
                    System.out.print("Enter customer name for table reservation: ");
                    String b = scanner.nextLine();
                    r1.bookTable(b);
                    break;
                case 3:
                    System.out.print("Enter customer order: ");
                    String c = scanner.nextLine();
                    r1.takeCustomerOrder(c);
                    break;
                case 4:
                    r1.printMenu();
                    break;
                case 5:
                    r1.printTableReservations();
                    break;
                case 6:
                    r1.printCustomerOrders();
                    break;
                case 7:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
