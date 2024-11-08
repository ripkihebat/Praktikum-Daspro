import java.util.Scanner;

public class orderanKafe18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("====MENU KAFE RIPKEY====");
        System.out.println("---------------------");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Dimsum Udang");
        System.out.println("3. Dimsum Siomay");
        System.out.println("4. Dimsum Sushi");
        System.out.println("5. Seblak");
        System.out.println("6. Cappucino");
        System.out.println("7. Chocolate Ice");
        String[] daftarMenu = {"Soto Ayam", "Dimsum Udang", "Dimsum Siomay", "Dimsum Sushi", "Seblak", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 10000, 15000, 17000, 13000, 13000, 14000};

        int[] daftarPesanan = new int[daftarMenu.length];
        
        String pilihMenu;
        int jumlahPesanan;
        double totalHarga = 0;

        while (true) {
            System.out.print("Masukkan nama menu (atau ketik 'selesai' untuk menyelesaikan pesanan): ");
            pilihMenu = sc18.nextLine();

            if (pilihMenu.equalsIgnoreCase("selesai")) {
                break;
            }

            int indeksMenu = -1;
            for (int i = 0; i < daftarMenu.length; i++) {
                if (daftarMenu[i].equalsIgnoreCase(pilihMenu)) {
                    indeksMenu = i;
                    break;
                }
            }

            if (indeksMenu != -1) {
                System.out.print("Masukkan jumlah pesanan untuk " + pilihMenu + ": ");
                jumlahPesanan = sc18.nextInt();
                sc18.nextLine(); 

                daftarPesanan[indeksMenu] += jumlahPesanan;

                totalHarga += daftarHarga[indeksMenu] * jumlahPesanan;

                System.out.println("Pesanan " + pilihMenu + " sebanyak " + jumlahPesanan + " berhasil ditambahkan.");
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia. Silakan pilih menu lain.");
            }
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + " = " + (daftarHarga[i] * daftarPesanan[i]));
            }
        }
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        System.out.println("\n=== TERIMA KASIH  TELAH BERBELANJA DI KAFE RIPKEY ===");
        
        sc18.close();
    }
}