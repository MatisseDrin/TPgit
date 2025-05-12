public class CouleurPieceException extends Exception {
    private char couleur;

    // Constructeur qui reçoit la couleur invalide
    public CouleurPieceException(char couleur) {
        this.couleur = couleur;
    }

    // Redéfinition de la méthode getMessage pour personnaliser le message d'erreur
    @Override
    public String getMessage() {
        return "Erreur dans la couleur de la pièce : " + couleur + " - La couleur doit être B ou N.";
    }
}
