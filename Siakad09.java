import java.util.Scanner;
public class Siakad09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masuskkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextDouble();

    nilaiAkhir = (nilaiKuis*20/200+ nilaiTugas*15/100 + nilaiUts*30/100 + nilaiUas*35/100);

        System.out.println("Mahasiswa dengan nama: " + nama + "\nNIM: " + nim);
        System.out.println("Kelas: " + kelas + "\nAbsen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
    }
}
