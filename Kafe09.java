import java.util.Scanner;
public class Kafe09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti, nominalInt;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        byte totalByte;
        float diskon = 10/100f;
    
    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan jumlah pembelian kopi: ");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh: ");
    jmlTeh = input.nextInt();
    System.out.print("Masukkan nilai pembelian roti: ");
    jmlRoti = input.nextInt();

    totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti*hargaRoti); 
    nominalBayar = totalHarga - (diskon*totalHarga);
    nominalInt = (int) nominalBayar;
    totalByte = (byte) totalHarga;

    System.out.println("Keanggotaan pelanggan " +keanggotaan);
    System.out.println("Item Pembelian " +jmlKopi + " Kopi, " +jmlTeh + " Teh, "  + jmlRoti + " Roti");
    System.out.println("Nominal bayar Rp" + totalByte);
    }   
}