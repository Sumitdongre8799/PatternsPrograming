
class patternOneLine {
    public static void main(String args[]) {

        // System.out.println("Hello Java");
        // System.out.print("Hello Java");
        // System.out.print("Hello Java");

        // System.out.println("*");

        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // for (

        // int counter = 0; counter < 13; counter = counter + 1) {
        // System.out.print();
        // }

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || j == 0 && i > 0 && i < (n - 1) / 2 || i == (n - 1) && j < (n - 1)
                        || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1) && j > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < (n - 1) || j == (n - 1) && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j && j <= (n - 1) / 2 || i + j == (n - 1) && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}