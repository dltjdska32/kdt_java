package chap11;



public class SystemDemo {
    public static void main(String[] args) {
        int[] src = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] dst = new int[] {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        System.arraycopy(src, 0, dst, 0, 4);

        printArray(src);
        printArray(dst);

        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.nanoTime());
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
