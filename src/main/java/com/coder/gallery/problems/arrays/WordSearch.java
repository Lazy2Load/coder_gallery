class WordSearch {
    
    public boolean exist(char[][] board, String word) {    	
    	int m = board.length;
    	int n = board[0].length;
		int[][] visited = new int[m][n];

		int k = 0;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){				
				if(board[i][j] == word.charAt(0)) {
                    if(backtrack(i,j,0,board,word,visited,m,n)){
                        return true;
                    }
                }
			}
		}
		return false;
    }

    private boolean backtrack(int i, int j, int k, char[][] board, String word, int[][] visited, int m, int n){
    	
    	if(k >= word.length()) return true;
		
    	if(board[i][j] == word.charAt(k)){
            if(k == (word.length()-1)) return true;
    	    visited[i][j] = 1;    
    		if(j+1<n && visited[i][j+1]==0 && backtrack(i, j+1, k+1, board, word, visited, m, n)) return true;
    		if(j-1>=0 && visited[i][j-1]==0 && backtrack(i, j-1, k+1, board, word, visited, m, n)) return true;
    		if(i+1<m && visited[i+1][j]==0 && backtrack(i+1, j, k+1, board, word, visited, m, n)) return true;
    		if(i-1>=0 && visited[i-1][j]==0 && backtrack(i-1, j, k+1, board, word, visited, m, n)) return true;
            visited[i][j] = 0;
    	}
    	return false;
    }
}