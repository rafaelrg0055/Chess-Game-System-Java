package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
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

	// ---------------------------------------------------------- ACTIONS
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	
	

}
