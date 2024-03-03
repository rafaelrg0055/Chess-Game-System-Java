package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	
	
	// ---------------------------------------------------------- CONSTRUCTOR
	public Rook(Board board, Color color) {
		super(board, color);
	}

	
	// ---------------------------------------------------------- STRING
	
		@Override
		public String toString() {
			return "R";
		}

	
	
}
