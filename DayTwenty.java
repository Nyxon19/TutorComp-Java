class Smartphone{
    private String brand;
    private int model;
    private double storageCapacity;
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(int model){
        this.model = model;
    }
    public void setStorageCapacity(double storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    
    public String getBrand(){
        return brand;
    }
    public int getModel(){
        return model;
    }
    public double getStorageCapacity(){
        return storageCapacity;
    }

    public double increaseStorage(double increase){
        storageCapacity+= increase;
        return storageCapacity;
    }
    
}

class DayTwenty{
    public static void main(String[] args) {
        Smartphone p1 = new Smartphone();
        p1.setStorageCapacity(9.48); 
        System.out.println(p1.getStorageCapacity());
        p1.increaseStorage(8.49);
        System.out.println(p1.getStorageCapacity());
    }
}
