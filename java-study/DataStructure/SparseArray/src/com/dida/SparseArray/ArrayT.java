package com.dida.SparseArray;

/**
 * @author 23216
 * @version 1.0
 * @description: 二维数组和稀疏数组
 * @date 2022/1/28 18:50
 */
public class ArrayT {
    public static void main(String[] args) {
        //创建一个原始的二维数组[][]
        //0表示没有棋子，1表示黑子 2表示蓝子
        int chess[][] = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;
        chess[4][5] = 2;
        //输出原始的二维数组
        System.out.println("二维数组");
        for (int[] ints : chess) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }

        //将二维数组转换为稀疏数组
        //1.遍历二维数组得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (chess[i][j] != 0){
                    sum++;
                }
            }
        }
        //2.创建对应的稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = chess.length;
        sparseArr[0][1] = chess.length;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非0的值存放到sparseArr中
        int count = 0;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if (chess[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chess[i][j];
                }
            }
        }
        //以稀疏数组的形式输出
        System.out.println();
        System.out.println("得到的稀疏数组为");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println();


        //将稀疏数组恢复成二维数组
        //1.先读取稀疏数组的第一行，根据第一行的数据复原原始的二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        //2.读取稀疏数组后几行的数据，赋给原始的二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }



        //输出恢复后的二维数组
        System.out.println();
        System.out.println("恢复的二维数组");

        for (int[] ints : chessArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }

    }
}
