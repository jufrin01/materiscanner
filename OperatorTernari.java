public class OperatorTernari{
        // LATIHAN OPERATOR TENARY
        ///////////////////////////
    public static void main(String[] args) {
        int nilaiA,nilaiB;
        String hasilnilai;

        nilaiA = 90;
        nilaiB = 80;

        //OPERATOR PEMBANDING MELIPUTI SIMBOL ;
        // > LEBIH BESAR
        // < LEBIH KECIL
        // == SAMA DENGAN
        // >= BESAR SAMADENGAN
        // <= KECIL SAMADENGAN
        // != TIDAK SAMADENGAN
        
        hasilnilai = nilaiA>nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI A = " +hasilnilai);
        hasilnilai = nilaiA<nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI B = " +hasilnilai);
        hasilnilai = nilaiA==nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI C = " +hasilnilai);
        hasilnilai = nilaiA>=nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI D = " +hasilnilai);
        hasilnilai = nilaiA<=nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI E = " +hasilnilai);
        hasilnilai = nilaiA!=nilaiB ? "LULUS" : "TIDAK LULUS";
        System.out.println("HASIL NILAI F = " +hasilnilai);



    }
    
}
