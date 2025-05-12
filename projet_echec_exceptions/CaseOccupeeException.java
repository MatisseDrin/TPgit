public class CaseOccupeeException extends Exception {
    private int x, y;

    public CaseOccupeeException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Impossible de placer une pièce en " + (char)(x + 'A') + (y + 1) + 
               " : une autre pièce s’y trouve déjà.";
    }
}
