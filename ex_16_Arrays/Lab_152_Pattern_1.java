package ex_16_Arrays;

public class Lab_152_Pattern_1 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        // 3 x 3

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
