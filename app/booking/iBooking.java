package app.booking;

import app.paket.KategoriPax;
import app.paket.TripPax;

public interface iBooking {
    void booking(TripPax trip, KategoriPax kategori, int jumlahPax);
}
