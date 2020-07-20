package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Nao precisaria declarar pois se nao declarasse a variavel continuaria sendo nula
	}

	protected Board getBoard() {
		return board;
	}
		
}
