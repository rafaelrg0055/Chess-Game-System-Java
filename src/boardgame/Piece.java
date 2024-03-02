package boardgame;

public class Piece {
	
	protected Position position;    
	private Board board;
	
	
	
	// ---------------------------------------------------------- CONSTRUCTOR
	public Piece(Board board) {
		this.board = board;
		position = null;    
	}


	// ---------------------------------------------------------- ENCAPSULATION
	protected Board getBoard() {
		return board;
	}
	
	
	




	
	
	
	
	

}
