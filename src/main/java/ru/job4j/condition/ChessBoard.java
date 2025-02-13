package ru.job4j.condition;

public final class ChessBoard {

    private ChessBoard() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int wayBishop(int x1, int y1, int x2, int y2) {
        if (!areCoordinatesValid(x1, y1, x2, y2) || Math.abs(x2 - x1) != Math.abs(y2 - y1)) {
            return 0;
        }
        return Math.abs(x2 - x1);
    }

    public static int wayRook(int x1, int y1, int x2, int y2) {
        if (!areCoordinatesValid(x1, y1, x2, y2) || (x1 != x2 && y1 != y2)) {
            return 0;
        }
        return Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
    }

    private static boolean areCoordinatesValid(int x1, int y1, int x2, int y2) {
        return isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2);
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
