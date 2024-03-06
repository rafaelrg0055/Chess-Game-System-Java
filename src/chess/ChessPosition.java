package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	// ---------------------------------------------------------- CONSTRUCTOR
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessExcepetion("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	
	// ---------------------------------------------------------- ENCAPSULATION
	
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}

				
	// ---------------------------------------------------------- ACTIONS
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	
	// ---------------------------------------------------------- STRING
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
