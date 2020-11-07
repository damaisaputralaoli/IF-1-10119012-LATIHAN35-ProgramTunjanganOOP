
package pbo10119012latihan35;

/**
 *
 * @author damai
 * NAMA  : DAMAI SAPUTRA LAOLI
 * KELAS : IF-1
 * NIM   : 10119012
 */
public class PBO10119012Latihan35 {

    
    public static void main(String[] args) {
        User karyawan = new User();
	System.out.println("==========Program Tunjangan==========");
	Double gajipokokKaryawan = karyawan.getGajipokok();
	String statusKaryawan = karyawan.getStatus();
    Double tunjanganKaryawan = karyawan.hitungTunjangan(statusKaryawan);
    Double totalGaji = karyawan.setTotal();
    System.out.println("\n========Hasil Perhitungan Gaji Anda========");
    System.out.printf("Gaji Pokok\t\t: Rp %.1f%n",gajipokokKaryawan);
    System.out.printf("Tunjangan\t\t: Rp %.1f%n",tunjanganKaryawan);
    System.out.printf("Total Gaji\t\t: Rp %.1f%n",totalGaji);
    System.out.println("(Developed by: Anggawan Ridho)");

    }
}
