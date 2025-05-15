package app.booking;

import app.paket.KategoriPax;
import app.paket.TripPax;

public class DataBooking {
    private TripPax trip;
    private KategoriPax kategori;
    private int jumlahPax;
    private double total;

    public DataBooking(TripPax trip, KategoriPax kategori, int jumlahPax) {
        this.trip = trip;
        this.kategori = kategori;
        this.jumlahPax = jumlahPax;
        this.total = kategori.getHargaPerPax() * jumlahPax;
    }

    public TripPax getTrip() {
        return trip;
    }

    public KategoriPax getKategori() {
        return kategori;
    }

    public int getJumlahPax() {
        return jumlahPax;
    }

    public double getTotal() {
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("--- DETAIL BOOKING ---");
        System.out.println("Trip : " + trip.getNamaTrip());
        System.out.println("Jumlah Pax : " + jumlahPax);
        System.out.println("Total : " + total);
    }
}

