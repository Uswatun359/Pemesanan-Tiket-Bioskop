import java.util.Scanner;

public class Film extends Kelas{
    Scanner input  = new Scanner(System.in);

    public void tampil(){
        System.out.println("==========================================");
        System.out.println("|            SELAMAT DATANG              |");
        System.out.println("|========================================|");
        System.out.println("|         Film Yang Sedang Tayang        |");
        System.out.println("|                                        |");
        System.out.println("| 1. QORIN                               |");
        System.out.println("| 2. 2045 APA ADA CINTA                  |");
        System.out.println("| 3. VIOLENT NIGHT                       |");
        System.out.println("| 4. NAGIH JANJI CINTA                   |");
        System.out.println("| 5. AVATAR : THE WAY OF WATER           |");
        System.out.println("| 6. ARGANTARA                           |");
        System.out.println("| 7. I WANNA DANCE WITH SOMEBODY         |");
        System.out.println("| 8. LIKE & SHARE                        |");
        System.out.println("| 9. THE BANISHING                       |");
        System.out.println("| 10. CEK TOKO SEBELAH 2                 |");
        System.out.println("==========================================");
        System.out.print("Pilih film yang ingin di tonton : ");
        pilih = input.nextInt();
        System.out.println();
    }
    public void duduk(){
        System.out.println("***  TEMPAT DUDUK  ***");
        System.out.println("A          |         H");
        System.out.println("B          |         I");
        System.out.println("C          |         J");
        System.out.println("D          |         K");
        System.out.println("E          |         L");
        System.out.println("F          |         M");
        System.out.println("G          |         N");
        System.out.print("Pilih tempat duduk beserta nomor 1-20 : ");
        nomor = input.next();
        System.out.println();
    }

    public void waktu(){
        System.out.println("=====  PILIH WAKTU =====");
        System.out.println("1. 11.30    |   5. 18.30");
        System.out.println("2. 13.45    |   6. 19.00");
        System.out.println("3. 15.00    |   7. 20.15");
        System.out.println("4. 17.15    |   8. 21.15");
        System.out.println("========================");
        System.out.print("Pilih jam untuk nonton : ");
        jam = input.nextInt();
        System.out.println();
    }
}