public class lab4 {
    public static void main(String[] args) {
        int[] a = {4, 8, 2, 5, 6};
        int[] b = new int[5];

        for (int i = 1; i <= a.length; i++) {
            b[a.length - i] = a[i - 1];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
