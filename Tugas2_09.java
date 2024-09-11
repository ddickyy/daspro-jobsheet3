import java.util.Scanner;
public class Tugas2_09 {
    
    public static void main(String[] args) {
    
        Scanner gaji = new Scanner (System.in);
        long jmlJam, upah, gajiAkhir, gajiAwal, bonus, pajak;

        System.out.println("Masukkan jumlah jam kerja Anda: ");    
        jmlJam = gaji.nextLong();
        System.out.println("Masukkan upah per jam Anda: ");
        upah = gaji.nextLong();
            
        gajiAwal = upah*jmlJam;
        gajiAkhir = ((gajiAwal + (gajiAwal*10/100)) - (gajiAwal*5/100)) *30;
        
        System.out.println("Gaji akhir Anda adalah Rp" +gajiAkhir);
    }

}