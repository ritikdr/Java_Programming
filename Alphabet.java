package pattern;

public class Alphabet {
    public static void main(String[] args) {
        //A

        // int n = 5;
        // int m = 9;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m ; j++) {
        //         if ((j == 6-i) || (i == 3 && j > 3 && j < 7) || (j == 4+i) ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //B

        // int n = 7;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ((i == 1 && j < n) || (i == n && j < n) || (i == 4 && j < n) || (j == 1) || (j == n && i > 1 && i < 4) || (j == n && i > 4 && i < n)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //C

        // int n = 7;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // D

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == 2 || j == n) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //E

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || i == 4 || j == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //F

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == 4 || j == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //G

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ((i == 1 && j > 1 && j < 4) || (i == n && j > 1 && j < 4) || (i == 4 && j >= 4 && j <= n)|| (j == 1 && i > 1 && i < n) || (j == n && i >= 4 && i <= n) || ( j == 4 && i >= 4 && i < n)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //H

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 4 || j == n || j == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //I

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == 4) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //J

        // int n = 7;
        // for (int i = 1;i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || (i == n && j > 1 && j < 4) || (j == 1 && i > 4 && i < n) || (j == 4 && i >= 1 && i < n)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //K

        int n = 7;
        int m = 4;
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 1 || j == 6-i || i == 2+j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
