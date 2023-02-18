public class PIRAMID{
    public class Pyramid {
        public static void main(String[] args) {
            String str = "ABCDEF";
            int n = str.length();
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j <= i) {
                    System.out.print(str.charAt(j));
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
    
}
