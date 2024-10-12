package entities;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String ownerName, boolean hasSidecar) {
        super(licensePlate, ownerName);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nomor Plat: " + getLicensePlate());
        System.out.println("Nama Pemilik: " + getOwnerName());
        System.out.println("Tipe Kendaraan: Motorcycle");
        System.out.println("Mempunyai Sespan: " + hasSidecar);
    }

    @Override
    public void setVehicleType(String newType) {
        if (newType.equalsIgnoreCase("Mobil")) {
            System.out.println("Tidak bisa mengubah Sepeda Motor menjadi Mobil!");
        } else {
            System.out.println("Tipe sepeda motor tetap sama.");
        }
    }
}
