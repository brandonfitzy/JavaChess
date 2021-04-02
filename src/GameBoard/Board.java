package GameBoard;

import Pieces.*;
import javafx.scene.layout.GridPane;

public class Board extends GridPane {

    public Space[][] spaces = new Space[8][8];

    public void assembleBoard(){
        //white pieces
        this.spaces[0][0].setPiece( new Rook("White"));
        this.spaces[1][0].setPiece( new Knight("White"));
        this.spaces[2][0].setPiece( new Bishop("White"));
        this.spaces[3][0].setPiece( new King("White"));
        this.spaces[4][0].setPiece( new Queen("White"));
        this.spaces[5][0].setPiece( new Bishop("White"));
        this.spaces[6][0].setPiece( new Knight("White"));
        this.spaces[7][0].setPiece( new Rook("White"));
        this.spaces[0][1].setPiece( new Pawn("White"));
        this.spaces[1][1].setPiece( new Pawn("White"));
        this.spaces[2][1].setPiece( new Pawn("White"));
        this.spaces[3][1].setPiece( new Pawn("White"));
        this.spaces[4][1].setPiece( new Pawn("White"));
        this.spaces[5][1].setPiece( new Pawn("White"));
        this.spaces[6][1].setPiece( new Pawn("White"));
        this.spaces[7][1].setPiece( new Pawn("White"));
        //black pieces
        this.spaces[0][8].setPiece( new Rook("Black"));
        this.spaces[1][8].setPiece( new Knight("Black"));
        this.spaces[2][8].setPiece( new Bishop("Black"));
        this.spaces[3][8].setPiece( new King("Black"));
        this.spaces[4][8].setPiece( new Queen("Black"));
        this.spaces[5][8].setPiece( new Bishop("Black"));
        this.spaces[6][8].setPiece( new Knight("Black"));
        this.spaces[7][8].setPiece( new Rook("Black"));
        this.spaces[0][7].setPiece( new Pawn("Black"));
        this.spaces[1][7].setPiece( new Pawn("Black"));
        this.spaces[2][7].setPiece( new Pawn("Black"));
        this.spaces[3][7].setPiece( new Pawn("Black"));
        this.spaces[4][7].setPiece( new Pawn("Black"));
        this.spaces[5][7].setPiece( new Pawn("Black"));
        this.spaces[6][7].setPiece( new Pawn("Black"));
        this.spaces[7][7].setPiece( new Pawn("Black"));
    }

}
