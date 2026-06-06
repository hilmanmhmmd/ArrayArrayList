package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        // 1. Array suhu
        double[] suhu = {30.5, 32.0, 29.8, 31.2, 33.5, 28.9};
        
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        for (int i = 0; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }
        
        System.out.println("Suhu tertinggi: " + tertinggi);
        System.out.println("Suhu terendah: " + terendah);

        
        // 2. Array nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("\nHari dengan huruf lebih dari 5:");
        for (int i = 0; i < hari.length; i++) {
            if (hari[i].length() > 5) {
                System.out.println(hari[i]);
            }
        }

        
        // 3. Menghitung angka genap
        int[] angka = {4, 8, 15, 16, 23, 42};
        
        int jumlahGenap = 0;
        
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }
        
        System.out.println("\nJumlah angka genap: " + jumlahGenap);
    }
}
