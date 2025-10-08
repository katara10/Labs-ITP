abstract class Bicycle {
    private String brand;
    private int gearCount;
    private double price;

    public Bicycle() {
        this.brand = "Unknown";
        this.gearCount = 1;
        this.price = 0.0;
    }

    public Bicycle(String brand, int gearCount, double price) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void ride();
    public abstract void displayInfo();
}

class MountainBike extends Bicycle {
    private boolean hasSuspension;
    private static int mountainBikeCount = 0;

    public MountainBike() {
        super();
        this.hasSuspension = false;
        mountainBikeCount++;
    }

    public MountainBike(String brand, int gearCount, double price, boolean hasSuspension) {
        super(brand, gearCount, price);
        this.hasSuspension = hasSuspension;
        mountainBikeCount++;
    }

    @Override
    public void ride() {
        System.out.println("Riding a mountain bike on rough terrain.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Mountain Bike: " + getBrand() + ", Gears: " + getGearCount() +
                ", Price: $" + getPrice() + ", Has Suspension: " + hasSuspension);
    }

    public static int getMountainBikeCount() {
        return mountainBikeCount;
    }
}

class KidsBike extends Bicycle {
    private String color;

    public KidsBike() {
        super();
        this.color = "Unknown";
    }

    public KidsBike(String brand, int gearCount, double price, String color) {
        super(brand, gearCount, price);
        this.color = color;
    }

    @Override
    public void ride() {
        System.out.println("Riding a kids bike in the park.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Kids Bike: " + getBrand() + ", Gears: " + getGearCount() +
                ", Price: $" + getPrice() + ", Color: " + color);
    }
}

class BMX extends Bicycle {
    private boolean isStunt;

    public BMX() {
        super();
        this.isStunt = false;
    }

    public BMX(String brand, int gearCount, double price, boolean isStunt) {
        super(brand, gearCount, price);
        this.isStunt = isStunt;
    }

    @Override
    public void ride() {
        System.out.println("Performing stunts on a BMX bike.");
    }

    @Override
    public void displayInfo() {
        System.out.println("BMX Bike: " + getBrand() + ", Gears: " + getGearCount() +
                ", Price: $" + getPrice() + ", Is Stunt: " + isStunt);
    }
}

public class BicycleDemo {
    public static void main(String[] args) {
        MountainBike mb1 = new MountainBike("Giant", 18, 500.0, true);
        mb1.displayInfo();
        mb1.ride();

        MountainBike mb2 = new MountainBike("Trek", 15, 350.0, true);
        mb2.displayInfo();
        mb2.ride();

        KidsBike kb1 = new KidsBike("Schwinn", 1, 150.0, "Red");
        kb1.displayInfo();
        kb1.ride();

        BMX bmx1 = new BMX("Haro", 1, 300.0, true);
        bmx1.displayInfo();
        bmx1.ride();

        System.out.println("Total Mountain Bikes created: " + MountainBike.getMountainBikeCount());
    }
}