package Modal;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
                String[][] chessBoard = new String[8][8];
                fill(chessBoard);
                moves(chessBoard);
        }

        private static void moves(String[][] chessBoard) {
                String num;
                System.out.println("Текущее положение коня В8В");
                System.out.println("Введите Ваш следующий шаг");
                Scanner input = new Scanner(System.in);
                num = input.next();
                if (num.equals("W6A")||num.equals("W6C"))
                        System.out.println("Шаг сделан успешно");
                else
                        System.out.println("Не правильно.Перезапустите програму и попробуйте еще раз.");
        }

         private static void fill ( String[][] chessBoard){
                 chessBoard[0][0] = "W8A";
                 chessBoard[0][1] = "B8B";
                 chessBoard[0][2] = "W8C";
                 chessBoard[0][3] = "B8D";
                 chessBoard[0][4] = "W8E";
                 chessBoard[0][5] = "B8F";
                 chessBoard[0][6] = "W8G";
                 chessBoard[0][7] = "B8H";

                 chessBoard[1][0] = "B7A";
                 chessBoard[1][1] = "W7B";
                 chessBoard[1][2] = "B7C";
                 chessBoard[1][3] = "W7D";
                 chessBoard[1][4] = "B7E";
                 chessBoard[1][5] = "W7F";
                 chessBoard[1][6] = "B7G";
                 chessBoard[1][7] = "W7H";

                 chessBoard[2][0] = "W6A";
                 chessBoard[2][1] = "B6B";
                 chessBoard[2][2] = "W6C";
                 chessBoard[2][3] = "B6D";
                 chessBoard[2][4] = "W6E";
                 chessBoard[2][5] = "B6F";
                 chessBoard[2][6] = "W6G";
                 chessBoard[2][7] = "B6H";

                 chessBoard[3][0] = "B5A";
                 chessBoard[3][1] = "W5B";
                 chessBoard[3][2] = "B5C";
                 chessBoard[3][3] = "W5D";
                 chessBoard[3][4] = "B5E";
                 chessBoard[3][5] = "W5F";
                 chessBoard[3][6] = "B5G";
                 chessBoard[3][7] = "W5H";

                 chessBoard[4][0] = "W4A";
                 chessBoard[4][1] = "B4B";
                 chessBoard[4][2] = "W4C";
                 chessBoard[4][3] = "B4D";
                 chessBoard[4][4] = "W4E";
                 chessBoard[4][5] = "B4F";
                 chessBoard[4][6] = "W4G";
                 chessBoard[4][7] = "B4H";

                 chessBoard[5][0] = "B3A";
                 chessBoard[5][1] = "W3B";
                 chessBoard[5][2] = "B3C";
                 chessBoard[5][3] = "W3D";
                 chessBoard[5][4] = "B3E";
                 chessBoard[5][5] = "W3F";
                 chessBoard[5][6] = "B3G";
                 chessBoard[5][7] = "W3H";

                 chessBoard[6][0] = "W2A";
                 chessBoard[6][1] = "B2B";
                 chessBoard[6][2] = "W2C";
                 chessBoard[6][3] = "B2D";
                 chessBoard[6][4] = "W2E";
                 chessBoard[6][5] = "B2F";
                 chessBoard[6][6] = "W2G";
                 chessBoard[6][7] = "B2H";

                 chessBoard[7][0] = "B1A";
                 chessBoard[7][1] = "W1B";
                 chessBoard[7][2] = "B1C";
                 chessBoard[7][3] = "W1D";
                 chessBoard[7][4] = "B1E";
                 chessBoard[7][5] = "W1F";
                 chessBoard[7][6] = "B1G";
                 chessBoard[7][7] = "W1H";



                 for (int i = 0; i < chessBoard.length; i++) {
                     for (int j = 0; j < chessBoard[i].length; j++) {
                             System.out.print(chessBoard[i][j] + "\t");
                                }
                                System.out.println();
                        }

                }

        }

