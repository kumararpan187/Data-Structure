
public class p1 {

    public static void square(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        square(5);
    }
}
