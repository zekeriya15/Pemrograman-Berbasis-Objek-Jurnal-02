import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = 0;

        do {

            System.out.println("1. Hitung Luas Balok");
            System.out.println("2. Hitung Volume Balok");
            System.out.println("3. Hitung Luas Permukaan Bola");
            System.out.println("4. Hitung Volume Bola");
            System.out.println("5. keluar");
            System.out.print("Masukkan pilihan: ");

            input = s.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Masukkan panjang balok: "); s.nextLine();
                    double pbalok = s.nextDouble();
                    System.out.print("Masukkan lebar balok: "); s.nextLine();
                    double lbalok = s.nextDouble();
                    System.out.print("Masukkan tinggi balok: "); s.nextLine();
                    double tbalok = s.nextDouble();

                    double luasPermukaanBalok = 2 * ((pbalok * lbalok) + (pbalok * tbalok) + (lbalok * tbalok));
                    System.out.println("Luas permukaan balok adalah: " + luasPermukaanBalok);
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: "); s.nextLine();
                    double panjang = s.nextDouble();
                    System.out.print("Masukkan lebar balok: "); s.nextLine();
                    double lebar = s.nextDouble();
                    System.out.print("Masukkan tinggi balok: "); s.nextLine();
                    double tinggi = s.nextDouble();

                    double volumeBalok = panjang * lebar * tinggi;
                    System.out.println("Volume balok adalah: " + volumeBalok + " cm");
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari bola: "); s.nextLine();
                    double jariJari = s.nextDouble();

                    double luasPermukaanBola = 4 * 3.14 * Math.pow(jariJari, 2);
                    System.out.println("Luas permukaan bola adalah: " + luasPermukaanBola + " cm^2");
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari bola: "); s.nextLine();
                    double jari2 = s.nextDouble();

                    double volumeBola = (4.0/3.0) * 3.14 * Math.pow(jari2, 3);
                    System.out.println("Volume bola adalah: " + volumeBola + " cm^3");
                    break;
                default :
                    System.out.println("Input tidak valid");
            }
        } while(input != 5);
    }
}