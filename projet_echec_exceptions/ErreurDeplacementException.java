public class ErreurDeplacementException extends Exception {
    private Position from, to;

    public ErreurDeplacementException(Position from, Position to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getMessage() {
        return "Impossible de faire le déplacement de " + from + " en " + to + ".";
    }
}
