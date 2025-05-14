import java.util.Scanner;

public class MainAntrian15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList15 antrian = new QueueLinkedList15();

        int pilihan;
        do {
            System.out.println("\n=== MENU ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Lihat Antrian Terdepan");
            System.out.println("6. Lihat Antrian Terakhir");
            System.out.println("7. Lihat Semua Antrian");
            System.out.println("8. Lihat Jumlah Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian tidak penuh.");
                    break;
                case 5:
                    antrian.peekFront();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    antrian.printQueue();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
