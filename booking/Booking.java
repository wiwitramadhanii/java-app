package booking;

import java.util.ArrayList;
import java.util.List;

import paket.KategoriPax;
import paket.TripPax;

public class Booking implements iBooking {
    List<DataBooking> daftarBooking = new ArrayList<>();

    public void booking(TripPax trip, KategoriPax kategori, int jumlahPax) {
        DataBooking data = new DataBooking(trip, kategori, jumlahPax);
        daftarBooking.add(data);
        System.out.println("Berhasil Booking");
        data.tampilkanInfo();
    }

    public boolean isEmpty() {
        return daftarBooking.isEmpty();
    }

    public void tampilkanSemuaBooking() {
        for (DataBooking data : daftarBooking) {
            data.tampilkanInfo();
        }
    }
}
