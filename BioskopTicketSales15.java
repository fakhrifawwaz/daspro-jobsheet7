import java.util.Scanner;

public class BioskopTicketSales15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalTickets = 0;
        double totalRevenue = 0.0;
        final double TICKET_PRICE = 50000.0;
        
        System.out.println("==== Program Penjualan Tiket Bioskop ====");
        System.out.println("Masukkan jumlah tiket per pelanggan (0 untuk mengakhiri hari):");
        
        while (true) {
            System.out.print("Jumlah tiket: ");
            int tickets = scanner.nextInt();
            
            if (tickets == 0) {
                break; // Akhiri hari
            } else if (tickets < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket positif atau 0 untuk selesai.");
                continue; // Abaikan dan minta ulang
            }
            
            // Hitung harga
            double price = tickets * TICKET_PRICE;
            if (tickets > 10) {
                price *= 0.85; // Diskon 15%
            } else if (tickets > 4) {
                price *= 0.9; // Diskon 10%
            }
            
            // Tambahkan ke total
            totalTickets += tickets;
            totalRevenue += price;
            
            System.out.printf("Harga untuk %d tiket: Rp %.0f\n", tickets, price);
        }
        
        System.out.println("\nTotal tiket terjual: " + totalTickets);
        System.out.printf("Total penjualan: Rp %.0f\n", totalRevenue);
        
        scanner.close();
    }
}
