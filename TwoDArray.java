public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        int[][] arr2 = new int[3][3];
        count = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = count++;
            }
        }

        int[][] sum = new int[3][3];
        int[][] product = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                product[i][j] = 0;
                for (int k = 0; k < arr.length; k++) {
                    product[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        sum = addMatrices(arr, arr2);
        product = multiplyMatrices(arr, arr2);
        }

        public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
        }

        public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
            result[i][j] = 0;
            for (int k = 0; k < a[0].length; k++) {
                result[i][j] += a[i][k] * b[k][j];
            }
            }
        }
        return result;
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Product of the two arrays:");
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
