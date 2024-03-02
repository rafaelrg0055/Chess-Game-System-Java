package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	
	
	// ---------------------------------------------------------- CONSTRUCTOR
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// ---------------------------------------------------------- ENCAPSULATION

	public Color getColor() {
		return color;
	}

	
	
	
	

}
