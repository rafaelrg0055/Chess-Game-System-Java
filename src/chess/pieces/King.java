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

	// ---------------------------------------------------------- ACTIONS
			
			@Override
			public boolean[][] possibleMoves() {
				boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
				return mat;
			}
	
}
