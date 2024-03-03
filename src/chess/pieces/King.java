package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	
	// ---------------------------------------------------------- CONSTRUCTOR
	public King(Board board, Color color) {
		super(board, color);
	}

	
	// ---------------------------------------------------------- STRING
	
			@Override
			public String toString() {
				return "K";
			}
	
}
