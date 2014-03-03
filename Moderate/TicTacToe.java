public static Piece hasWonOwn(Piece[][] board) {
	int m = board.length;
	int n = board[0].length;

	// Check rows and cols.
	for(int i =0; i<m; i++){
		int row = 0;
		int col = 0;
		Piece rowTarget = board[i][0];
		Piece colTarget = board[0][i];
		for(int j = 0; j<n; j++){
			if(board[i][j]==rowTarget){
				row++;
			}
			if(board[j][i]==colTarget){
				col++;
			}
		}
		if(rowTarget!=Piece.Empty&&row==m){
			return rowTarget;
		}
		if(colTarget!=Piece.Empty&&col==n){
			return colTarget;
		}
	}

	// Check diagonals.
	// m==n
	Piece diag1 = board[0][0];
	Piece diag2 = board[m][0];
	if(diag1==Piece.Empty&&diag2==Piece.Empty){
		return Piece.Empty;
	}
	int d1 = 0;
	int d2 = 0;
	for(int i = 0; i<m; i++){
		if(board[i][i]==diag1){
			d1++;
		}
		if(board[m-i][i]==diag2){
			d2++;
		}
	}

	if(diag1!=Piece.Empty&&d1==m){
		return diag1;
	}

	if(diag2!=Piece.Empty&&d2==n){
		return diag2;
	}

	return Piece.Empty;
}