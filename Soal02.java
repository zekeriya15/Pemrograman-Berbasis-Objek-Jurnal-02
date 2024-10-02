import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<String, ArrayList<Integer>> nilaiPerKelas = new HashMap<String, ArrayList<Integer>>();

        int input = 0;

        String namaKelas = "";

        do { 
            System.out.println("-- Nilai PBO --");
            System.out.println("1. Buat Kelas Baru");
            System.out.println("2. Masukkan Nilai ke Kelas");
            System.out.println("3. Lihat Nilai");
            System.out.println("4. Tampilkan Statistik");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            input = s.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Masukkan nama kelas: "); s.nextLine();
                    String kelas = s.nextLine();
                                                                    // we cant put null as value in the hashmap even though we havnt add value to the arraylist yet
                    nilaiPerKelas.put(kelas, new ArrayList<>());    // everytime new key added to the hashmap we need to initialize its arraylist    
                    break;
                case 2:
                    System.out.println("-- List nama kelas --");
                    for (String i : nilaiPerKelas.keySet()) {
                        System.out.println("- " + i);
                    }

                    System.out.print("Masukkan nama kelas yang ingin dimasukkan nilai: "); s.nextLine();
                    namaKelas = s.nextLine();
                    System.out.print("Masukkan nilai: ");
                    int nilai = s.nextInt();
                    nilaiPerKelas.get(namaKelas).add(nilai);        // .get = method hashmap, .add = method arraylist
                    break;
                case 3:
                    System.out.println("-- List nama kelas --");
                    for (String i : nilaiPerKelas.keySet()) {
                        System.out.println("- " + i);
                    }

                    System.out.print("Masukkan nama kelas untuk memunculkan nilai: "); s.nextLine();
                    namaKelas = s.nextLine();
                    // for (int i : nilaiPerKelas.get(namaKelas)) {
                    //     System.out.print(i + " ");
                    // }
                    System.out.println(nilaiPerKelas.get(namaKelas));
                    break;
                case 4:
                    ArrayList<Integer> nilaiSemuaKelas = new ArrayList<>();

                    for (String i : nilaiPerKelas.keySet()) {
                        for (int j : nilaiPerKelas.get(i)) {
                            nilaiSemuaKelas.add(j);
                        }
                    }


                    System.out.println("1. Munculkan statistik nilai dari seluruh kelas");
                    System.out.println("2. Munculkan statistik nilai berdasarkan kelas");
                    System.out.print("Masukkan pilihan: ");
                    int choice = s.nextInt();

                    s.nextLine();  // consume the leftover new line

                    if (choice == 1) {
                        System.out.println("-- Statistik nilai seluruh kelas --");
                        System.out.println("Rata-rata nilai dari seluruh kelas: " + avg(nilaiSemuaKelas));
                        System.out.println("Nilai terbesar dari seluruh kelas: " + max(nilaiSemuaKelas));
                        System.out.println("Nilai terkecil dari seluruh kelas: " + min(nilaiSemuaKelas));
                    } else if (choice == 2) {
                        System.out.println("-- List nama kelas --");
                        for (String i : nilaiPerKelas.keySet()) {
                            System.out.println("- " + i);
                        }

                        System.out.print("Masukkan nama kelas untuk memunculkan statistik: ");
                        namaKelas = s.nextLine();

                        System.out.println("Rata-rata nilai dari kelas " + namaKelas + ": " + avg(nilaiPerKelas.get(namaKelas)));
                        System.out.println("Nilai terbesar dari kelas " + namaKelas + ": " + max(nilaiPerKelas.get(namaKelas)));
                        System.out.println("Nilai terkecil dari kelas " + namaKelas + ": " + min(nilaiPerKelas.get(namaKelas)));
                    } else {
                        break;
                    }    
                break;
                    
            }
            
        } while (input != 0);
        
    }

    private static int avg(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return sum / list.size();
    }

    private static int max(ArrayList<Integer> list) {
        int maximum = list.get(0);              // we cant put 0 as placeholder cuz 0 might be the highest value in the list
        for (int i : list) {
            if (maximum < i) {
                maximum = i;
            }
        }

        return maximum;
    }

    private static int min(ArrayList<Integer> list) {
        int minimum = list.get(0);              // we cant put 0 as placeholder for the min value 
        for (int i : list) {
            if (minimum > i) {
                minimum = i;
            }
        }

        return minimum;
    }
}
