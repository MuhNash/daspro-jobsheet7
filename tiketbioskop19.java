import java.util.Scanner;

public class tiketbioskop19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTiket = 0, jmlTiket, penjualanTotal = 0;
        String namaPelanggan;
        int hargaTiket = 50000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk Keluar): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("selesai")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah tiket: ");
            jmlTiket = input.nextInt();
            totalTiket += jmlTiket;

            double jmlHarga = 0;
            if (jmlTiket > 10) {
                jmlHarga = (jmlTiket * hargaTiket) * 0.85;
            } else if (jmlTiket > 4) {
                jmlHarga = (jmlTiket * hargaTiket) * 0.90;
            } else if (jmlTiket <= 3){
               jmlHarga = jmlTiket * hargaTiket; 
            } else{
               System.out.println("Masukkan jumlah tiket yang valid"); 
            }

            System.out.println("Total harga yang perlu dibayar: " + jmlHarga);
            penjualanTotal += jmlHarga;
            input.nextLine();
        } while (true);

        System.out.println("Total tiket yang terjual sebanyak: " + totalTiket);
        System.out.println("Pendapatan penjualan tiket: Rp " + penjualanTotal);

        input.close();
    }
}
