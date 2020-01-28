
/*5*) Написать метод который найдет минимальный элемент матрицы.*/
public class Task9_5 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{12, 25}, {10, 7}};
        int min = matrix1[0][0];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] < min) {
                    min = matrix1[i][j];
                }


            }
        }
        System.out.println(min);

    }

}
