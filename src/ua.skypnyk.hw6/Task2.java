package src.ua.skypnyk.hw6;

public class Task2 {
        public static void main(String[] args) {
                int[][] triangle = new int[5][];
                triangle[0] = new int[1];
                triangle[1] = new int[2];
                triangle[2] = new int[3];
                triangle[3] = new int[4];
                triangle[4] = new int[5];
                for (int i = 0; i < triangle.length; i++) {
                    System.out.println(triangle.length + "!");
                    System.out.println("i = " + i);
                    for (int j = 0; j < triangle[i].length; j++) {
                        System.out.println(triangle[i].length);
                        triangle[i][j] = 0;
                    }
                }
            // 23 lines: java.lang.IndexOutOfBoundsException : Invalid array range: 1 to 1
            // 22 exchange i -> j  для перебора столбцов в каждой строке
                for (int i = 0; i < triangle.length; i++) {
                    for (int j = 0; j < triangle[i].length; j++) {
                        System.out.print(triangle[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
