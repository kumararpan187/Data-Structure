public class p6 {
    public static void p6(int n) {
        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int j = n; j >= i; j--) {
                System.out.print(num);
                num++;
                
            }
            System.out.println();
        }

    }
public static void main(String[] args) {
    p6(5);
}
}
