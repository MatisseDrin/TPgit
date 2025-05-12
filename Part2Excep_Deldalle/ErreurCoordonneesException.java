public class ErreurCoordonneesException extends Exception {
    private int x, y;

    public ErreurCoordonneesException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        String retour = "";
        if (this.x < 0 || this.x > 7) {
            retour += "Erreur dans la position X : " + this.x + " - Les indices doivent être compris entre 0 et 7.\n";
        }
        if (this.y < 0 || this.y > 7) {
            retour += "Erreur dans la position Y : " + this.y + " - Les indices doivent être compris entre 0 et 7.\n";
        }
        return retour;
    }
}
