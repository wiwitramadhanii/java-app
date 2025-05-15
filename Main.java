import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import booking.Booking;
import paket.KategoriPax;
import paket.TripPax;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TripPax golden = new TripPax("Golden Hours Cruise", Arrays.asList(
            new KategoriPax("10-14", 10, 14, 529000),
            new KategoriPax("15-19", 15, 19, 399000),
            new KategoriPax("20-24", 20, 24, 349000),
            new KategoriPax("25-50", 25, 50, 279000)
        ));

        TripPax morning = new TripPax("Morning Samalona", Arrays.asList(
            new KategoriPax("10-14", 10, 14, 599000),
            new KategoriPax("15-19", 15, 19, 490000),
            new KategoriPax("20-24", 20, 24, 419000),
            new KategoriPax("25-50", 25, 50, 379000)
        ));

        TripPax fullday = new TripPax("Full Day Kodingareng", Arrays.asList(
            new KategoriPax("10-14", 10, 14, 1090000),
            new KategoriPax("15-19", 15, 19, 790000),
            new KategoriPax("20-24", 20, 24, 690000),
            new KategoriPax("25-50", 25, 50, 590000)
        ));

        List<TripPax> semuaTrip = Arrays.asList(golden, morning, fullday);

        boolean mulai = true;
        Booking booking = new Booking();

        while (mulai) {
            System.out.println("MENU UTAMA");
            System.out.println("1. Daftar Paket Trip");
            System.out.println("2. Booking");
            System.out.println("3. Informasi Booking");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("DAFTAR PAKET TRIP");
                    for (int i = 0; i < semuaTrip.size(); i++) {
                        System.out.println((i + 1) + ". " + semuaTrip.get(i).getNamaTrip());
                    }
                    break;
                    
                case 2:
                    System.out.println("Pilih Paket Trip");
                    for (int i = 0; i < semuaTrip.size(); i++) {
                        System.out.println((i + 1) + ". " + semuaTrip.get(i).getNamaTrip());
                    }
                    System.out.print("Pilih Menu: ");

                    int pilihan = scanner.nextInt();
                    if (pilihan < 1 || pilihan > semuaTrip.size()) {
                        System.out.println("ERROR");
                        break;
                    }

                    TripPax dipilih = semuaTrip.get(pilihan - 1);
                    dipilih.tampilkanInfo();

                    System.out.print("Pilih Kategori Pax : ");
                    int pilihKategori = scanner.nextInt();
                    if (pilihKategori < 1 || pilihKategori > 4) {
                        System.out.println("ERROR");
                        break;
                    }

                    KategoriPax kategoriDipilih = dipilih.getDaftarKategori().get(pilihKategori - 1);
                    System.out.print("Jumlah Pax (" + kategoriDipilih.getMin() + "-" + kategoriDipilih.getMax() + "):");
                    int jumlah = scanner.nextInt();

                    if (jumlah >= kategoriDipilih.getMin() && jumlah <= kategoriDipilih.getMax()) {
                        booking.booking(dipilih, kategoriDipilih, jumlah);
                    } else {
                        System.out.println("ERROR");
                    }
                    break;

                case 3:
                    if (booking.isEmpty()) {
                        System.out.println("Belum memiliki pesanan");
                        System.out.println("Silahkan lakukan pemesanan terlebih dahulu");
                    } else {
                        booking.tampilkanSemuaBooking();
                    }
                    break;

                case 4:
                    System.out.println("Terima Kasih !");
                    mulai = false;
                    break;

                default:
                    System.out.println("ERROR");
            }
        }

        scanner.close();
    }
}
