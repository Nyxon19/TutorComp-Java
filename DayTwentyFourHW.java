import java.util.Arrays;
import java.util.Scanner;
class Inventory{
    private String itemID;
    private String itemName;
    private double pricePerUnit;
    private int quantity;
    private String[] inventory1;
    private double[] inventoryPrice;
    private int[] inventoryStock;
    private int inventoryStorage;
    Inventory(String itemID, String itemName, double pricePerUnit, int quantity, int inventoryStorage){
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.inventoryStorage = inventoryStorage;
        inventory1 = new String[inventoryStorage];
        inventoryPrice = new double[inventoryStorage];
        inventoryStock = new int[inventoryStorage];
    }
    int b =1;
    public void calculateTotalValue(){
        double a = quantity*pricePerUnit;
        double e=0;
        double c;
        for(int i=1; i<inventoryStorage;i++){
            c = inventoryPrice[i] * inventoryStock[i];
            e=e+c;
        }
        double d = a + e;
        System.out.println("Total Value of all stock: " + d);

    }
    public void addObject(){
        Scanner sc = new Scanner(System.in);
        inventory1[0] = itemName;
        inventoryPrice[0] = pricePerUnit;
        System.out.println("What is the name of the item?");
        String newName = sc.nextLine();
        inventory1[b] = newName;
        System.out.println("What is the price of this item?");
        double newPrice = sc.nextDouble();
        inventoryPrice[b] = newPrice;
        System.out.println("What is the initial stock of the item?");
        int newStock = sc.nextInt();
        inventoryStock[b] = newStock;
        b++;
    }
    public void editObject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the item number of what you want to edit?");
        int editInventoryNumber = sc.nextInt();
        System.out.println("What is the new name of the item?");
        sc.nextLine();
        String changeName = sc.nextLine();
        System.out.println("What is the new price of the item?");
        double changePrice = sc.nextDouble();
        System.out.println("What is the stock of the new item?");
        int changeStock = sc.nextInt();
        inventory1[editInventoryNumber-1] = changeName;
        inventoryPrice[editInventoryNumber-1] = changePrice;
        inventoryStock[editInventoryNumber-1] = changeStock;
    }
    public void seeInventory(){
        System.out.println(Arrays.toString(inventory1));
    }
    public void removeObject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What number of the item you want to remove?");
        int removeInventoryNumber = sc.nextInt();
        inventory1[removeInventoryNumber-1] = null;
        inventoryPrice[removeInventoryNumber-1] = 0.00;
        inventoryStock[removeInventoryNumber-1] = 0;
    }
    public void searchInventory() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the item to search:");
    String searchName = sc.nextLine();
    boolean found = false;
    for (int i = 0; i < inventoryStorage; i++) {
        if (inventory1[i] != null && inventory1[i].equalsIgnoreCase(searchName)) {
            System.out.println("Item found!");
            System.out.println("Name: " + inventory1[i]);
            System.out.println("Price per unit: $" + inventoryPrice[i]);
            System.out.println("Stock available: " + inventoryStock[i]);
            found = true;
        }
    }
    if (!found) {
        System.out.println("Item not found in the inventory.");
    }
}

}
public class DayTwentyFourHW {
    public static void main(String[] args) {
        Inventory i1 = new Inventory("39298849283", "Food", 3.5, 3, 3);
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("Welcome to Inventory System, type the number of your desired option:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Edit Item");
            System.out.println("4. View Inventory");
            System.out.println("5. Search Inventory");
            System.out.println("6. See worth of inventory");
            System.out.println("7. Exit System");
            a = sc.nextInt();
            switch(a){
                case 1:
                    i1.addObject();
                    break;
                case 2:
                    i1.removeObject();
                    break;
                case 3:
                    i1.editObject();
                    break;
                case 4:
                    i1.seeInventory();
                    break;
                case 5:
                    i1.searchInventory();
                    break;
                case 6:
                    i1.calculateTotalValue();
                    break;
                case 7:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Sorry, thats not a valid option - Try again.");
            }
        }while(a!=5);
    }
}