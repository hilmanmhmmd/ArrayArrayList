package bagian2.arraylist;
import java.util.ArrayList;
public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        // 1. Daftar belanja
        ArrayList<String> belanja = new ArrayList<>();
        
        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");
        
        // hapus item ke-2 (index 1)
        belanja.remove(1);
        
        System.out.println("Daftar belanja:");
        for (int i = 0; i < belanja.size(); i++) {
            System.out.println(belanja.get(i));
        }
        System.out.println("Jumlah item: " + belanja.size());

        
        // 2. Cari nilai terbesar
        ArrayList<Integer> angka = new ArrayList<>();
        
        angka.add(10);
        angka.add(25);
        angka.add(5);
        angka.add(40);
        angka.add(15);
        
        int terbesar = angka.get(0);
        
        for (int i = 0; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }
        
        System.out.println("\nNilai terbesar: " + terbesar);

        
        // 3. Nama diawali huruf A
        ArrayList<String> nama = new ArrayList<>();
        
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Asep");
        nama.add("Citra");
        nama.add("Alya");
        nama.add("Dina");
        
        System.out.println("\nNama yang diawali huruf A:");
        for (int i = 0; i < nama.size(); i++) {
            if (nama.get(i).startsWith("A")) {
                System.out.println(nama.get(i));
            }
        }
    }
}
