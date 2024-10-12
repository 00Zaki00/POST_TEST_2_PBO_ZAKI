package entities;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, String ownerName, int numberOfDoors) {
        super(licensePlate, ownerName);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nomor Plat: " + getLicensePlate());
        System.out.println("Nama Pemilik: " + getOwnerName());
        System.out.println("Tipe Kendaraan: Car");
        System.out.println("Jumlah Pintu: " + numberOfDoors);
    }

    @Override
    public void setVehicleType(String newType) {
        if (newType.equalsIgnoreCase("Motor")) {
            System.out.println("Tidak bisa mengubah Mobil menjadi Sepeda Motor!");
        } else {
            System.out.println("Car type remains the same.");
        }
    }
}
