package management;

import entities.Car;
import entities.Motorcycle;
import entities.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

public class TrafficManagement implements VehicleManagement {  
    private final ArrayList<Vehicle> vehicles;

    // Constructor
    public TrafficManagement() {
        vehicles = new ArrayList<>();
    }

    // Method CRUD dari Interface
    @Override
    public void addVehicle(String licensePlate, String vehicleType, String ownerName) {
        Scanner sc = new Scanner(System.in);
        if (vehicleType.equalsIgnoreCase("Mobil")) {
            System.out.print("Masukkan jumlah pintu mobil: ");
            int numberOfDoors = sc.nextInt();
            Vehicle newVehicle = new Car(licensePlate, ownerName, numberOfDoors);
            vehicles.add(newVehicle);
        } else if (vehicleType.equalsIgnoreCase("Motor")) {
            System.out.print("Apakah memiliki sidecar? (true/false): ");
            boolean hasSidecar = sc.nextBoolean();
            Vehicle newVehicle = new Motorcycle(licensePlate, ownerName, hasSidecar);
            vehicles.add(newVehicle);
        } else {
            System.out.println("Jenis kendaraan tidak dikenali.");
            return;
        }
        System.out.println("Kendaraan berhasil ditambahkan!");
    }

    @Override
    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Belum ada kendaraan yang terdaftar.");
        } else {
            for (Vehicle vehicle : vehicles) {
                vehicle.displayInfo();
                System.out.println("-------------------");
            }
        }
    }

    @Override
    public void updateVehicle(String licensePlate) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                System.out.print("Masukkan jenis kendaraan baru (Mobil/Motor): ");
                String newType = sc.nextLine();
                System.out.print("Masukkan nama pemilik baru: ");
                String newOwner = sc.nextLine();
                vehicle.setVehicleType(newType);  // Memperbarui tipe kendaraan
                vehicle.setOwnerName(newOwner);  // Memperbarui nama pemilik
                System.out.println("Kendaraan berhasil diperbarui!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kendaraan dengan plat nomor tersebut tidak ditemukan.");
        }
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
            System.out.println("Kendaraan berhasil dihapus!");
            Vehicle.totalVehicles--;
        } else {
            System.out.println("Kendaraan dengan plat nomor tersebut tidak ditemukan.");
        }
    }

    // Method tambahan untuk melihat total kendaraan
    public static void displayTotalVehicles() {
        System.out.println("Total Kendaraan: " + Vehicle.totalVehicles);
    }

    // Main method untuk menjalankan sistem
    public static void main(String[] args) {
        TrafficManagement tm = new TrafficManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Sistem Manajemen Lalu Lintas ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Lihat Semua Kendaraan");
            System.out.println("3. Perbarui Kendaraan");
            System.out.println("4. Hapus Kendaraan");
            System.out.println("5. Lihat Total Kendaraan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();
            sc.nextLine();  // Clear input buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Masukkan plat nomor: ");
                    String licensePlate = sc.nextLine();
                    System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
                    String vehicleType = sc.nextLine();
                    System.out.print("Masukkan nama pemilik: ");
                    String ownerName = sc.nextLine();
                    tm.addVehicle(licensePlate, vehicleType, ownerName);
                }
                case 2 -> tm.displayVehicles();
                case 3 -> {
                    System.out.print("Masukkan plat nomor kendaraan yang ingin diubah: ");
                    String updatePlate = sc.nextLine();
                    tm.updateVehicle(updatePlate);
                }
                case 4 -> {
                    System.out.print("Masukkan plat nomor kendaraan yang ingin dihapus: ");
                    String deletePlate = sc.nextLine();
                    tm.deleteVehicle(deletePlate);
                }
                case 5 -> TrafficManagement.displayTotalVehicles();
                case 6 -> System.out.println("Keluar dari sistem.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 6);
    }
}
