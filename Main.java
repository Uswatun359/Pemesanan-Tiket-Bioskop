import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("|   PEMBELIAN TIKET BIOSKOP   |");
        System.out.println("*******************************");
        System.out.println("             Tanggal 18/12/2022");
        System.out.println();
        System.out.println("=   Identitas Pembeli   =");
        System.out.println("Masukkan nama : ");
        String nama = input.next();
        System.out.println();

        Film film = new Film();
        film.tampil();
        film.waktu();

        Harga hrg = new Harga();
        hrg.totalHarga();
        film.duduk();
        hrg.displayHarga();
    }
}