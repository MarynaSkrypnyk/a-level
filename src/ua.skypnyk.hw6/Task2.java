package src.ua.skypnyk.hw6;

public class Task2 {
        public static void main(String[] args) {
            //All index out of bounds for their length
            int[][] triangle = new int[5][];
            triangle[0] = new int[0];
            triangle[1] = new int[1];
            triangle[2] = new int[2];
            triangle[3] = new int[3];
            triangle[4] = new int[4];
            for (int i = 0; i < triangle.length; i++) {
                System.out.println(triangle.length + "!");
                System.out.println("i = " + i);
                for (int j = 0; j < triangle[i].length; j++) {
                    System.out.println(triangle[i].length);
                    triangle[i][j] = 0;
                }
            }

            for (int i = 0; i < triangle.length; i++) {
                for (int j = 0; i < triangle[i].length; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
