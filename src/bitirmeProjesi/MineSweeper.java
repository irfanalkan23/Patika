package bitirmeProjesi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[row][col];

        String[][] minedMatrix = setUpMatrix(matrix);
        System.out.println("Mayınların Konumu");
        printMatrix(minedMatrix);
        System.out.println("========================");

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        String[][] gameMatrix = startMatrix(matrix);
        printMatrix(gameMatrix);

        while (true){
            System.out.print("Satır Giriniz : ");
            int r = scanner.nextInt();
            System.out.print("Sütün Giriniz : ");
            int c = scanner.nextInt();
            play(gameMatrix, minedMatrix, r, c);
            System.out.println("=========================");
        }


    }

    private String[][] play(String[][] gameMatrix, String[][] minedMatrix, int r, int c) {
        if(r == 0 && c == 0){
            if (minedMatrix[0][0].equals("*")){

            }
        } else if(r > 0 && r < gameMatrix[0].length){

        }
        return gameMatrix;
    }

    private String[][] startMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            Arrays.fill(strings, "-");
        }
        return matrix;
    }

    private void printMatrix(String[][] matrix){
        for (String[] rows : matrix) {
            for (String cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    private String[][] setUpMatrix(String[][] matrix){
        Random random = new Random();
        int matrixSize = matrix.length * matrix[0].length;
        int numberOfMines = matrixSize / 4;
        System.out.println(numberOfMines);

        //Matriksin eleman sayısı dahilinde Random sayı üreterek mineCoordinates dizisi içerisine kaydediyoruz.
        int[] mineCoordinates = new int[numberOfMines];
        for (int i = 0; i < numberOfMines; i++) {
            int randomCoordinate = random.nextInt(matrixSize);
            while (arrayContains(mineCoordinates, randomCoordinate)){
                randomCoordinate = random.nextInt(matrixSize);
            }
            mineCoordinates[i] = randomCoordinate;
        }
        System.out.println("mineCoordinates = " + Arrays.toString(mineCoordinates));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int mineCoordinate : mineCoordinates) {
                    matrix[i][j] = "-";
                    if (mineCoordinate == ((i + j) + (i * matrix[0].length))) {
                        matrix[i][j] = "*";
                        break;
                    }
                }
            }
        }
        return matrix;
    }

    private boolean arrayContains(int[] array, int number){
        for (int i : array) {
            if (i == number){
                return true;
            }
        }
        return false;
    }

}

