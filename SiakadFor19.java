import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidak_lulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();

            if (nilai <= 60) {
                lulus++;
            } else{
                tidak_lulus++;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Lulus: " + lulus);
        System.out.println("jumlah Tidak Lulus: " + tidak_lulus);

        input.close();
    }
}
