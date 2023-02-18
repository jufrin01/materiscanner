public class OperatorLogika1 {
    public static void main(String[] args) {
        double a= 2.00;
        double b= 3.00;
        double c= 4.00;
        double d= 6.00;

        boolean hasillogika0 = a<b && a>c && c==d;
        System.out.println("HASIL LOGIKA1 = " + hasillogika0);
        boolean hasillogika1 = c>d || a<d || b>c;
        System.out.println("HASIL LOGIKA2 = "+ hasillogika1);
        boolean hasillogika2 = a>b && c<d || c<=d;
        System.out.println("HASIL LOGIKA3 = " +hasillogika2);
        boolean hasillogika3 = a>b && a<b || a>d && c>d;
        System.out.println("HASIL LOGIKA4 = "+ hasillogika3);
    }
    
}
