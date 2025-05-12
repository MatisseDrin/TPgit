class Position{
    private int x, y;

    public Position(){
	this.x = 0;
	this.y = 0;
    }

    public Position(int x, int y){
        /* CAS 1 */
	try{
	    if(x < 0 || x > 7){
		throw new ErreurCoordonneesException(x, y);
	    }
	    if(y < 0 || y > 7){
		throw new ErreurCoordonneesException(x, y);
	    }
	}
	catch(ErreurCoordonneesException e){
	    System.out.println(e.getMessage());
	    System.exit(1);
	}
	this.x = x;
	this.y = y;
    }

    public Position(String position){
	/*
	Nous devrions tester la longueur de la chaine *position*
	mais pour une simplification du TP, nous ne faisons pas ce test.
	*/
	
	int x = (int)(position.charAt(0)-'A');
	int y = (int)(position.charAt(1)-'1');
	
	/* CAS 2 */
	try{
	    if(x < 0 || x > 7){
		throw new ErreurCoordonneesException(x, y);
	    }
	    if(y < 0 || y > 7){
		throw new ErreurCoordonneesException(x, y);
	    }
	}
	catch(ErreurCoordonneesException e){
	    System.out.println(e.getMessage());
	    System.exit(1);
	}
	
	this.x = x;
	this.y = y;
    }

    public Position(Position position){
	this.x = position.x;
	this.y = position.y;
    }

    

    public int getX(){
	return this.x;
    }

    public int getY(){
	return this.y;
    }

    public void setX(int x){
        /* CAS 3 */
		try{
			if(x < 0 || x > 7){
			throw new ErreurCoordonneesException(x, y);
			}
			if(y < 0 || y > 7){
			throw new ErreurCoordonneesException(x, y);
			}
		}
		catch(ErreurCoordonneesException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	this.x = x;
    }

    public void setY(int y){
        /* CAS 4 */
		try{
			if(x < 0 || x > 7){
			throw new ErreurCoordonneesException(x, y);
			}
			if(y < 0 || y > 7){
			throw new ErreurCoordonneesException(x, y);
			}
		}
		catch(ErreurCoordonneesException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	this.y = y;
    }


    public boolean equals(Object o) {
        if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof Position)) {
            return false; 
        } 
	
        Position p = (Position) o; 
          
        return (this.x == p.x) && (this.y == p.y);
    }
    

    public String toString(){
	return "("+(char)(x+'A')+""+(y+1)+")";
    }

    
    
    public static void main(String[] args){
        // OK
	Position p = new Position();
	System.out.println(p);
	
	// OK
	p = new Position("F4");
	System.out.println(p);
	
	// Attention ! Erreur
	// x doit être compris entre 0 et 7
	p = new Position(4,8);
	System.out.println(p);
    }
    
}