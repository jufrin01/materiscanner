public class OPERATORTENARY {
    public static void main(String[] args) {
        int makanan1,makanan2;
        String jawaban;
        makanan1= 40;
        makanan2= 49;
        jawaban = makanan1<makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit1   = " +jawaban);
        jawaban = makanan1>makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit2   = " +jawaban);
        jawaban = makanan1==makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit3   = " +jawaban);
        jawaban = makanan1>=makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit4   = " +jawaban);
        jawaban = makanan1<=makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit5   = " +jawaban);
        jawaban = makanan1!=makanan2 ? "bakso" : "pizza" ;
        System.out.println("pilihan makanan favorit5   = " +jawaban);

    }
}
