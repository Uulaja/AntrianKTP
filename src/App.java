import java.util.Scanner;

public class App {
    // atribut data
    private static int pilihan;
    private static String no;
    private static String nama;
    private static String alamat;
    private static boolean kondisi;
    private static final Scanner read = new Scanner(System.in);
    private static final Queue ktp = new Queue();

    // implementasi queue
    public static void main(String[] args) {
        do {
            System.out.println("--------------------------");
            System.out.println("PENDAFTARAN E-KTP ");

            System.out.println("--------------------------");
            System.out.println("Pilihan Menu :");

            System.out.println("--------------------------");
            System.out.println("1. Pendaftaran");
            System.out.println("2. Lihat Daftar Antrian");
            System.out.println("3. Panggil Pendaftar");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan menu : ");
            pilihan = read.nextInt();
            switch (pilihan) {
                case 1:
                    pendaftaran();
                    break;
                case 2:
                    daftarAntrian();
                    break;
                case 3:
                    keluarAntrian();
                    break;
                default:
                    invalidMenu();
            }
        } while (pilihan != 0);
    }

    // procedure memasukkan data pada queue / Pendaftaran
    static void pendaftaran() {
        System.out.println("Pendaftaran");
        System.out.println("--------------------------");
        System.out.print("Masukkan No Pendaftar : ");
        no = read.next();
        System.out.print("Masukkan Nama Pendaftar : ");
        nama = read.next();
        System.out.print("Masukkan Alamat Pendaftar : ");
        alamat = read.next();
        Pendaftar kartu = new Pendaftar(no, nama, alamat, kondisi);
        // Pendaftar kartu = new Pendaftar(nama, kondisi);
        ktp.enqueue(kartu, 0);
    }

    // procedure melihat isi data pada queue
    static void daftarAntrian() {
        System.out.println("Lihat Daftar Antrian");
        System.out.println("--------------------------");
        ktp.cetak(no, nama, alamat, kondisi);
    }

    // procedure mengambil/menghapus data pada queue
    static void keluarAntrian() {
        System.out.println("Panggil Pendaftar");
        System.out.println("--------------------------");
        if (ktp.kosong() == true) {
            System.out.println("Antrian telah kosong");
        } else {
            Object dtHapus = ktp.dequeue();
            System.out.printf("%s telah keluar dari antrian\n", dtHapus);
        }
    }

    // procedure untuk input pilihan menu keluar atau tidak ada
    static void invalidMenu() {
        if (pilihan == 0) {
            System.out.println("\nKeluar dari Program");
            System.out.println("-------------------");
        } else {
            System.out.println("PILIHAN MENU TIDAK TERSEDIA");
            System.out.println("Silahkan Ulang Input Pilihan\n");
        }
    }

}
