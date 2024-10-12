package management;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ACER NITRO
 */
public interface VehicleManagement {
    void addVehicle(String licensePlate, String vehicleType, String ownerName);
    void displayVehicles();
    void updateVehicle(String licensePlate);
    void deleteVehicle(String licensePlate);
}

