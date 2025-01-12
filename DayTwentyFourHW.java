import java.util.Arrays;
import java.util.Scanner;
class Inventory{
    private String itemID;
    private String itemName;
    private double pricePerUnit;
    private int quantity;
    private String[] inventory1;
    //private int inventoryStorage;
    Inventory(String itemID, String itemName, double pricePerUnit, int quantity, int inventoryStorage){
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        //this.inventoryStorage = inventoryStorage;
        inventory1 = new String[inventoryStorage];
    }
    int b =1;
    
    public void calculateTotalValue(){
        double a = quantity*pricePerUnit;
        System.out.println("Total Value of all stock: " + a);

    }
    public void addObject(){
        inventory1[0] = itemName;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the item?");
        String newItem = sc.nextLine();
        inventory1[b] = newItem;
        b++;
    }
    public void seeInventory(){
        System.out.println(Arrays.toString(inventory1));
    }
}
public class DayTwentyFourHW {
    public static void main(String[] args) {
        Inventory i1 = new Inventory("39298849283", "Food", 3.5, 3, 3);
        // Inventory i2 = new Inventory("12345", "Bags", 3.5, 50, 50);
        i1.calculateTotalValue();
        i1.addObject();
        i1.seeInventory();
        // i2.calculateTotalValue();
        // i2.addObject();
        // i2.seeInventory();
    }
}
