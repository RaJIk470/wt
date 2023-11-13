public class T2 {
    public boolean verify(int x, int y) {
        return checkBottom(x, y) || checkTop(x, y);
    }

    private boolean checkBottom(int x, int y) {
        return x >= -6 && x <= 6 && y >= -3 && y <= 0;
    }

    private boolean checkTop(int x, int y) {
        return x >= -4 && x <= 4 && y >= 0 && y <= 5;
    }
}
