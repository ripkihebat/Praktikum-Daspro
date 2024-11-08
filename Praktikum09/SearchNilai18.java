import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilai = sc18.nextInt();

        int[] arrNilai = new int[nilai];
        
        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc18.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = sc18.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (nilaiDicari == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai "+nilaiDicari+" ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        }  else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        sc18.close();
    }
}