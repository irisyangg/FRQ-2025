public boolean clearPair(int row, int col){
        int piece=puzzle[row][col];
        for(int i=row; i<puzzle.length; i++){
            for(int j=0; j<puzzle[0].length; j++){
                if(piece==puzzle[i][j] || piece+puzzle[i][j]==10){
                    puzzle[i][j]=0;
                    piece=0;
                    return true;
                }
            }
        }
        return false;
    }
