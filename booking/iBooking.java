package booking;

import paket.KategoriPax;
import paket.TripPax;

public interface iBooking {
    void booking(TripPax trip, KategoriPax kategori, int jumlahPax);
}
