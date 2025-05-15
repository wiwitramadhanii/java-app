package app.paket;

public class KategoriPax {
    private String range;
    private int min, max;
    private double hargaPerPax;

    public KategoriPax(String range, int min, int max, double hargaPerPax) {
        this.range = range;
        this.min = min;
        this.max = max;
        this.hargaPerPax = hargaPerPax;
    }

    public String getRange() {
        return range;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getHargaPerPax() {
        return hargaPerPax;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setHargaPerPax(double hargaPerPax) {
        this.hargaPerPax = hargaPerPax;
    }

    public void tampilkan() {
        System.out.println("Kategori : " + range + "Mulai dari : " + hargaPerPax);
    }
}

