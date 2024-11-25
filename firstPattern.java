package pattern;

public class firstPattern {
    // public static void main(String[] args){
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args){
    //     int n = 5;
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args){
    //     int n = 5;
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = i; j < n; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (2 * i - 1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args){
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = i; j < n; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (2 * i - 1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args){
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 || i == n || j == 1 || j == n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    public static void main(String[] args){
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j < n) || (i == 4 && j < n) || (i == n && j < n) || j == 1 || (j == n && i > 1 && i < 4) || (j == n && i > 4 && i < n)) {
                    System.out.print("*");
                } else { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
