
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class PieceUI {
	public ImageIcon render(ChessGamePiece piece) {
		if ( piece.getColorOfPiece() == ChessGamePiece.WHITE ){
			return new ImageIcon(
				getClass().getResource("chessImages/White"+piece.getClass().getName()+".gif")
			);			
		}
		else if ( piece.getColorOfPiece() == ChessGamePiece.BLACK ){
			return new ImageIcon(
				getClass().getResource("chessImages/Black"+piece.getClass().getName()+".gif")
			);
		}
		else{
			return new ImageIcon(
				getClass().getResource("chessImages/Black"+piece.getClass().getName()+".gif")
			);
		}
	}
}
