import java.util.ArrayList;

class Dame extends Piece {
    
    public Dame() throws CouleurPieceException, ErreurCoordonneesException {
        super('B', new Position());
    }

    public Dame(char couleur, Position position) throws CouleurPieceException, ErreurCoordonneesException {
        super(couleur, position);
    }

    public String getType() {
        return "dame";
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> retour = new ArrayList<Position>();

        Tour t = null;
        try {
            t = new Tour(this.getCouleur(), this.getPosition());
        } catch (CouleurPieceException | ErreurCoordonneesException e) {
            e.printStackTrace();
        }

        Fou f = null;
        try {
            f = new Fou(this.getCouleur(), this.getPosition());
        } catch (CouleurPieceException | ErreurCoordonneesException e) {
            e.printStackTrace();
        }

        if (t != null) {
            retour.addAll(t.getDeplacementPossible(pl));
        }

        if (f != null) {
            retour.addAll(f.getDeplacementPossible(pl));
        }

        return retour;
    }
}
