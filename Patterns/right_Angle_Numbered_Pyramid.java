public class right_Angle_Numbered_Pyramid {
    public static void numpy(int n) {

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numpy(5);
    }

}
