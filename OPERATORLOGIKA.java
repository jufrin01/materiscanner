public class OPERATORLOGIKA {
    public static void main(String[] args) {
        boolean X,Y,Z;

        X = false;
        Y = true ;

        //OPERATOR LOGIKA MELIPUTI SIMBOL,
        // && LOGIKA AND
        // || LOGIKA OR
        //  ! LOGIKA TIDAK/NEGASI


        Z = X&&Y;
        System.out.println("HASIL LOGIKA AND    =  " +Z);
        Z = X||Y;
        System.out.println("HASIL LOGIKA OR     =  " +Z);
        System.out.println("HASIL LOGIKA NEGASI =  " +!X);
        System.out.println("HASIL LOGIKA NEGASI =  " +!Y);
    }
    
}
