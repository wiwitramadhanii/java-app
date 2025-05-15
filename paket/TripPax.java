package paket;

import java.util.List;

public class TripPax extends PaketTrip {
    
    private List<KategoriPax> daftarKategori;

    public TripPax(String namaTrip, List<KategoriPax> daftarKategori) {
        super(namaTrip);
        this.daftarKategori = daftarKategori;
    }

    public List<KategoriPax> getDaftarKategori() {
        return daftarKategori;
    }

    public void setDaftarKategori(List<KategoriPax> daftarKategori) {
        this.daftarKategori = daftarKategori;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Paket Trip : " + getNamaTrip());
        for (int i = 0; i < daftarKategori.size(); i++) {
            KategoriPax kategori = daftarKategori.get(i);
            System.out.println((i + 1) + ". Kategori : " + kategori.getRange() + " pax Mulai dari : Rp " + kategori.getHargaPerPax());
        }
    }
}

