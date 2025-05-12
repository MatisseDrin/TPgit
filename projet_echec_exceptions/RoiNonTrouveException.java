public class RoiNonTrouveException extends Exception {
    private char couleur;

    public RoiNonTrouveException(char couleur) {
        this.couleur = couleur;
    }

    @Override
    public String getMessage() {
        String nomCouleur = (couleur == 'B') ? "blanc" : "noir";
        return "Le roi " + nomCouleur + " est introuvable.";
    }
}
