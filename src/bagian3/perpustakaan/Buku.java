package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // tambahan

    // constructor baru
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // OPTIONAL (biar aman kalau dosen pakai yang lama)
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = 0;
        this.dipinjam = false;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis +
               " (" + tahunTerbit + ") [" + status + "]";
    }
}