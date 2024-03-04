package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	
	// ---------------------------------------------------------- CONSTRUCTOR
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// ---------------------------------------------------------- ENCAPSULATION
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	// ---------------------------------------------------------- STRING
	
	@Override
	public String toString() {
		return row + ", " + column;
	}

	
	// ---------------------------------------------------------- ACTIONS
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}


	
}
