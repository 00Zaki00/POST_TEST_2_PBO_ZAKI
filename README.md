![Screenshot 2024-10-12 162306](https://github.com/user-attachments/assets/6f16974a-fc6b-4f71-87ef-b26733aeb3a9)
Ketika pengguna memilih 1 (menambahkan kendaraan), program akan meminta input dari pengguna, seperti plat nomor, jenis kendaraan (pilihan antara "Mobil" atau "Motor"), dan nama pemilik.
Jika memilih Mobil, program akan meminta jumlah pintu mobil dan menambahkannya ke daftar kendaraan.
Jika memilih Motor, program akan menanyakan apakah motor memiliki sidecar atau tidak, lalu menambahkannya ke daftar.
Output yang dihasilkan setelah menambah kendaraan adalah pesan yang menunjukkan kendaraan berhasil ditambahkan.
![image](https://github.com/user-attachments/assets/b4ae40b2-b7ea-4362-b0f9-8d2dff94e9cd)
Ketika memilih opsi ini, program akan menampilkan seluruh daftar kendaraan yang sudah ditambahkan ke dalam sistem, mencakup detail seperti plat nomor, nama pemilik, jenis kendaraan, dan properti spesifik (jumlah pintu untuk mobil, ada/tidaknya sidecar untuk motor).
Setiap kendaraan ditampilkan secara terpisah dengan informasi yang terstruktur.
![Screenshot 2024-10-12 162706](https://github.com/user-attachments/assets/99efc103-4f66-459e-9c98-30c2ae8fa65f)
Pengguna diminta untuk memasukkan plat nomor kendaraan yang ingin diperbarui. Setelah itu, pengguna bisa memperbarui nama pemilik dan jenis kendaraan
Program akan memeriksa apakah plat nomor sesuai dengan kendaraan yang ada di dalam sistem. Jika ditemukan, nama pemilik kendaraan akan diperbarui.
jika pengguna ingin mengganti jenis kendaraan maka akan keluar output notif seperti di gambar
Output akan menampilkan pesan bahwa kendaraan berhasil diperbarui.
![image](https://github.com/user-attachments/assets/7afa5e56-4d8e-42c0-9e44-77c2ef775ad3)
Pengguna akan diminta untuk memasukkan plat nomor kendaraan yang ingin dihapus. Setelah kendaraan ditemukan, program akan menghapusnya dari daftar dan menampilkan pesan bahwa kendaraan berhasil dihapus.
![image](https://github.com/user-attachments/assets/ca767113-0d23-443f-9808-df3388473614)
Menampilkan total jumlah kendaraan yang saat ini terdaftar dalam sistem.
![image](https://github.com/user-attachments/assets/2dee46b3-197e-49f0-9446-44e61d7a7902)
Program akan keluar dari sistem.


Penerapan :
Inheritance : diterapkan dengan adanya kelas Car dan Motorcycle yang mewarisi dari kelas abstrak Vehicle.
Car menambahkan atribut spesifik, yaitu numberOfDoors.
Motorcycle menambahkan atribut hasSidecar.
Keduanya mewarisi properti umum seperti licensePlate dan ownerName dari Vehicle.

Encapsulation : diterapkan karena setiap properti dalam kelas-kelas ini bersifat private dan hanya dapat diakses atau dimodifikasi menggunakan metode getter dan setter.
Properti-properti seperti licensePlate, ownerName, numberOfDoors, dan hasSidecar diakses melalui getter dan diubah melalui setter.

Abstraction : diterapkan melalui kelas abstrak Vehicle, yang mendefinisikan metode abstrak displayInfo() yang diimplementasikan di subclass (Car dan Motorcycle).

Interface : VehicleManagement digunakan untuk mendefinisikan metode CRUD
addVehicle(): Menambahkan kendaraan ke dalam daftar.
displayVehicles(): Menampilkan seluruh kendaraan yang terdaftar.
updateVehicle(): Memperbarui informasi kendaraan.
deleteVehicle(): Menghapus kendaraan dari daftar.

Final :Kata kunci final digunakan dalam kelas TrafficManagement untuk mendeklarasikan list vehicles sebagai final, yang berarti referensi ke objek list tidak dapat diubah setelah inisialisasi.
