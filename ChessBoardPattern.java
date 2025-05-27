package lab01_08;

public class ChessBoardPattern {
    public static void main(String[] args) {
        int size = 8; // Size of the chessboard
        for(int i =0; i<size;i++) {
            for(int j = 0; j<size;j++){
                if((i+j)%2 == 0) {
                    System.out.print("X "); // Print X for even positions
                } else {
                    System.out.print("O "); // Print O for odd positions
                }

            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
