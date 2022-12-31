import java.util.Scanner;
public class Harga extends Kelas{
    @Override
    void totalHarga(){
        super.totalHarga();
        Scanner input = new Scanner(System.in);
        System.out.println("Harga Tiket : Rp. 35.000");
        System.out.println("Jumlah Tiket Yang Dibeli : ");
        int beli = input.nextInt();
        total = beli * 35000;
        System.out.println();
    }
    @Override
    void displayHarga(){
        super.displayHarga();
        int uangmasuk, jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("TOTAL BIAYA : Rp. "+this.total);
        System.out.println("*******************************");
        System.out.println("Total uang yang dibiayakan Rp. ");
        uangmasuk = input.nextInt();
        jumlah = uangmasuk - this.total;
        if (uangmasuk >= this.total){
            System.out.println("Kembali : Rp. "+ jumlah);
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("---            TERIMAKASIH              ---");
            System.out.println("---         SELAMAT MENIKMATI           ---");
            System.out.println("-------------------------------------------");
            System.out.println("Harap datang 10 menit  sebelum film dimulai");
        }else if (uangmasuk < this.total){
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Mohon maaf uang anda tidak cukup");
            System.out.println("--------------------------------");
        }
    }
}