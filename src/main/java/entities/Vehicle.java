package entities;

public abstract class Vehicle {
    private String licensePlate;
    private String ownerName;

    public static int totalVehicles = 0; // Static keyword

    // Constructor
    public Vehicle(String licensePlate, String ownerName) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        totalVehicles++; // Setiap kali kendaraan dibuat, jumlah kendaraan bertambah
    }

    // Getter dan Setter
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Method abstrak yang akan diimplementasikan di subclass
    public abstract void displayInfo();

    // Method untuk set vehicle type
    public void setVehicleType(String newType) {
        System.out.println("Tipe kendaraan tidak bisa diubah secara langsung.");
    }
}
