import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] tablicaMIejsc5 = new int[5];
        tablicaMIejsc5[0] = 50;
        tablicaMIejsc5[1] = 3; // 1 3
        tablicaMIejsc5[2] = 6;
        tablicaMIejsc5[3] = 12;
        tablicaMIejsc5[4] = 27;


//        int suma = 0;
//
//        for (int i = 0; i < tablicaMIejsc5.length; i++) {
//
//            suma += tablicaMIejsc5[i];
//
//        }
//        System.out.println(suma);
//        for (int i = 0; i < tablicaMIejsc5.length; i++) {
//
//            if (tablicaMIejsc5[i] % 2 == 0) {
//                tablicaMIejsc5[i] = tablicaMIejsc5[i] * 4;
//            } else {
//                tablicaMIejsc5[i] = tablicaMIejsc5[i] * 3;
//            }
//            System.out.println(tablicaMIejsc5[i]);
//
//
//        }


// ------------------------ Zadanie choinka --------------------------------


        char[][] twoDimensionMatrix = new char[4][7];

        for (char[] dimensionMatrix : twoDimensionMatrix) {
            Arrays.fill(dimensionMatrix, ' ');
        }


        for (int row = 0; row < twoDimensionMatrix.length; row++) {
            int middle = twoDimensionMatrix[row].length / 2; // Środek wiersza
            int left = middle - row; // Początek gwiazdek
            int right = middle + row; // Koniec gwiazdek

            for (int col = left; col <= right; col++) {
                twoDimensionMatrix[row][col] = '*'; // Gwiazdki
            }
        }


        for (char[] row : twoDimensionMatrix) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(); // Nowa linia
        }
    }







}










