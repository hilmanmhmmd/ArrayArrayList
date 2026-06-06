package tugas;

public class MainTugas {
    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // tambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "001", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "003", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "004", 60));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "005", 50));

        //array mata kuliah
        String[] matkul = {"PBO", "Basis Data", "Algoritma"};

        System.out.println("== Mata Kuliah ==");
        for (String m : matkul) {
            System.out.println("- " + m);
        }

        System.out.println();

        kelas.tampilkanSemua();

        System.out.println();

        //rata-rata & jumlah lulus
        System.out.println("Rata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus: " + kelas.jumlahLulus());

        System.out.println();

        //tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "006", 90));

        System.out.println("Jumlah mahasiswa sekarang: " + kelas.jumlahMahasiswa());
    }
}