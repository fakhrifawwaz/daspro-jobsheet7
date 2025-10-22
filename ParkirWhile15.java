import java.util.Scanner;

public class ParkirWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) { // Mobil
                total += durasi * 3000;
            } else if (jenis == 2) { // Motor
                total += durasi * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("Total biaya parkir = Rp " + total);

        sc.close();
    }
}
