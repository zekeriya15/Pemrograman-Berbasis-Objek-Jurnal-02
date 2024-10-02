import java.util.ArrayList;
import java.util.Scanner;

class Soal2 {
    private ArrayList<Integer> nilai;

    public NilaiPbo() {
        nilai = new ArrayList<>();
    }

    public void tambahNilai(int nilai) {
        this.nilai.add(nilai);
    }

    public ArrayList<Integer> getNilai() {
        return nilai;
    }

    public void tampilkanStatistik() {
        if (nilai.isEmpty()) {
            System.out.println("Tidak ada nilai.");
            return;
        }

        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        for (int n : nilai) {
            total += n;
            if (n > tertinggi) tertinggi = n;
            if (n < terendah) terendah = n;
        }

        double rataRata = (double) total / nilai.size();
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}

public class Soal2 {
    static NilaiPbo kelas01 = new NilaiPbo();
    static NilaiPbo kelas02 = new NilaiPbo();
    static NilaiPbo kelas03 = new NilaiPbo();
    static NilaiPbo kelas04 = new NilaiPbo();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("---- Menu ----");
            System.out.println("1. Masukan Nilai ");
            System.out.println("2. Tampilkan Nilai ");
            System.out.println("3. Lihat Statistik ");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    inputNilai(s);
                    break;
                case 2:
                    lihatNilai();
                    break;
                case 3:
                    lihatStatistik();
                    break;
                case 4:
                    System.out.println("Keluar dari Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    public static void inputNilai(Scanner s) {
        System.out.println("Pilih kelas: ");
        System.out.println("1. Kelas01");
        System.out.println("2. Kelas02");
        System.out.println("3. Kelas03");
        System.out.println("4. Kelas04");
        int kelas = s.nextInt();

        System.out.print("Masukkan nilai PBO: ");
        int nilai = s.nextInt();

        switch (kelas) {
            case 1:
                kelas01.tambahNilai(nilai);
                break;
            case 2:
                kelas02.tambahNilai(nilai);
                break;
            case 3:
                kelas03.tambahNilai(nilai);
                break;
            case 4:
                kelas04.tambahNilai(nilai);
                break;
            default:
                System.out.println("Kelas tidak valid.");
        }
    }

    public static void lihatNilai() {
        System.out.println("Nilai Kelas01: " + kelas01.getNilai());
        System.out.println("Nilai Kelas02: " + kelas02.getNilai());
        System.out.println("Nilai Kelas03: " + kelas03.getNilai());
        System.out.println("Nilai Kelas04: " + kelas04.getNilai());
    }

    public static void lihatStatistik() {
        System.out.println("Statistik Kelas01:");
        kelas01.tampilkanStatistik();

        System.out.println("Statistik Kelas02:");
        kelas02.tampilkanStatistik();

        System.out.println("Statistik Kelas03:");
        kelas03.tampilkanStatistik();

        System.out.println("Statistik Kelas04:");
        kelas04.tampilkanStatistik();

        ArrayList<Integer> gabungan = new ArrayList<>();
        gabungan.addAll(kelas01.getNilai());
        gabungan.addAll(kelas02.getNilai());
        gabungan.addAll(kelas03.getNilai());
        gabungan.addAll(kelas04.getNilai());

        System.out.println("Statistik Semua Kelas:");
        if (gabungan.isEmpty()) {
            System.out.println("Tidak ada nilai dari semua kelas.");
        } else {
            NilaiPbo kelasGabungan = new NilaiPbo();
            for (Integer n : gabungan) {
                kelasGabungan.tambahNilai(n);
            }
            kelasGabungan.tampilkanStatistik();
        }
    }
}