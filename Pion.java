abstract class Pion extends Piece{
    
    public Pion() throws CouleurPieceException, ErreurCoordonneesException{
	super('B', new Position());
    }

    public Pion(char couleur, Position position) throws CouleurPieceException, ErreurCoordonneesException{
	super(couleur, position);
    }
    
    public String getType(){
    	return new String("pion");
    }
}
