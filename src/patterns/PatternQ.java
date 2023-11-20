package patterns;

public class PatternQ {
    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void halfPyramidOfNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
           for (int j = 1; j <= c; j++) {
               if (i == 1 || i == r || j == 1 || j == c)
                   System.out.print(" * ");
               else
                   System.out.print("   ");
           }
            System.out.println();
        }
    }

    public void invertedAndRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //printing stars
            for (int  j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int  j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}