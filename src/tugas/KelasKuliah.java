package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (Mahasiswa m : daftar) {
            System.out.println(m.info());
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }
        return total / daftar.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : daftar) {
            if (m.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftar.size();
    }
}