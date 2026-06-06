package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    // constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // cek lulus
    public boolean lulus() {
        return nilai >= 60;
    }

    // biar gampang ditampilkan
    public String info() {
        return nama + " (" + npm + ") - Nilai: " + nilai +
               (lulus() ? " [LULUS]" : " [TIDAK LULUS]");
    }
}