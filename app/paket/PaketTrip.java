package app.paket;

public abstract class PaketTrip {

    private String namaTrip;

    public PaketTrip(String namaTrip) {
        this.namaTrip = namaTrip;
    }

    public String getNamaTrip() {
        return namaTrip;
    }

    public void setNamaTrip(String namaTrip) {
        this.namaTrip = namaTrip;
    }

    public abstract void tampilkanInfo();
}

