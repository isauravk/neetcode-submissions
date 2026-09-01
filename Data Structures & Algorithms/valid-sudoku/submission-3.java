class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row check
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(set.contains( board[i][j] ) )return false;
                set.add(board[i][j]);
            }
        }
        //column check
        for(int j=0;j<9;j++){
            Set<Character> set=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]=='.') continue;
                if(set.contains( board[i][j] ) )return false;
                set.add(board[i][j]);
            }
        }

          for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                Set<Character> set=new HashSet<>();
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {

                        if (board[row][col] == '.') continue;

                        if (set.contains(board[row][col])) return false;
                        set.add(board[row][col]);
                    }
                }
            }
        }
        
        return true;
    }
}
