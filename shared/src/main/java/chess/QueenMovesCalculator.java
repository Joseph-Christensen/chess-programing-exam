package chess;

import java.util.Collection;
import java.util.HashSet;

public class QueenMovesCalculator {

    private final ChessBoard board;
    private final ChessPosition position;
    private final ChessPiece piece;

    QueenMovesCalculator(ChessBoard board, ChessPosition position, ChessPiece piece) {
        this.board = board;
        this.position = position;
        this.piece = piece;
    }

    public Collection<ChessMove> returnMoves() {
        int row = position.getRow();
        int col = position.getColumn();
        var moves = new HashSet<ChessMove>();
        ChessPiece.PieceType type = piece.getPieceType();
        return moves;
    }
}
