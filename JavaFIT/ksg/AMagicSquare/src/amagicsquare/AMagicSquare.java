package amagicsquare;

import java.util.Scanner;

public class AMagicSquare {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b, d;
        int c = 1;

        System.out.println("Enter the size of the matrix(<=5): ");

        int n = scn.nextInt();

        if (n > 5) {
            System.out.println("Invalid input; enter a number between 1 and 5");
        } else {
            int magic[][] = new int[n][n];

            for (a = 0; a < n; a++) {
                for (b = 0; b < n; b++) {
                    magic[a][b] = 0;
                }
            }

            if (n % 2 != 0) {
                a = 0;
                b = n / 2;

                while (c <= n * n) {
                    magic[a][b] = c++;
                    a--;
                    b++;

                    if (a < 0 && b > n - 1) {
                        a = a + 2;
                        b--;
                    } else if (a < 0) {
                        a = n - 1;
                    } else if (b > n - 1) {
                        b = 0;
                    } else if (magic[a][b] > 0) {
                        a = a + 2;
                        b--;
                    }
                }
            } else {

                for (a = 0; a < n; a++) {
                    for (b = 0; b < n; b++) {
                        magic[a][b] = c++;
                    }
                }

                b = n - 1;
                for (a = 0; a < n / 2; a++) {
                    d = magic[a][a];
                    magic[a][a] = magic[b][b];
                    magic[b][b] = d;

                    d = magic[a][b];
                    magic[a][b] = magic[b][a];
                    magic[b][a] = d;
                    b--;
                }
            }

            System.out.println();
            System.out.println("The Magic Matrix of size " + n + "x" + n + " is: ");

            for (a = 0; a < n; a++) {
                for (b = 0; b < n; b++) {
                    System.out.printf(magic[a][b] + "\t");
                }
                System.out.println();
            }
        }

    }
}
