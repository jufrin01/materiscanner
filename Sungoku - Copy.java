import java.util.Scanner;

public class Sungoku{
    public static void main(String[] args) {
        String nama,alamat,hobi,perkerjaan,univesitas,warna;
        int umur,nomorinduk;
        long nokartu;

        Scanner loli = new Scanner (System.in) ;

        System.out.print("Masukan nama        = ");
        nama = loli.nextLine();
        System.out.print("Masukan alamat      = ");
        alamat = loli.nextLine();
        System.out.print("Masukan universitas = ");
        univesitas = loli.nextLine();
        System.out.print("Masukan umur        = ");
        umur = loli.nextInt();
        System.out.print("Masukan noInduk     = ");
        nomorinduk = loli.nextInt();
        System.out.print("Masukan noKartu     = ");
        nokartu = loli.nextLong();

        warna = umur %2==0 ?"hitam" : "biru" ;
        perkerjaan  = nomorinduk %2==0 ? "Sales" : "Servis" ;

        System.out.println("============DATA DIRI============");
        System.out.println("=================================");
        
        System.out.println("Nama Anda      = " +nama);
        System.out.println("Alamat Anda    = " + alamat);
        System.out.println("Umur Anda      = " + umur+ "Tahun");
        System.out.println("Universitas    = " + univesitas);
        System.out.println("Nomor Induk    = " +nomorinduk);
        System.out.println("NomorKartu     = " + nokartu);
        System.out.println("Warna Kesukaan = " + warna);
        System.out.println("Perkerjaan     = "+ perkerjaan);












        

        
    }
    
}
