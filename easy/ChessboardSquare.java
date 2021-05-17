// Problem URL: https://leetcode.com/problems/determine-color-of-a-chessboard-square/submissions/

class ChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        String alpha = "abcdefgh";
        char coordAlpha = coordinates.charAt(0);
        int number = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        return ((alpha.indexOf(coordAlpha)+number)%2 == 0);
    }
}