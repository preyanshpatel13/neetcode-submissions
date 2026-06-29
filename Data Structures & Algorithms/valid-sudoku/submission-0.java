class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int row=0; row < 9; row++){
            for(int col=0; col < 9; col++){
                char num = board[row][col];

                if (num == '.') {
                    continue;
                }

                String rowkey = num + " in row " + row;
                String colkey = num + " in col " + col;
                String boxkey = num + " in box " + (row / 3) + "-" + (col / 3); 

                if(set.contains(rowkey) || set.contains(colkey) || set.contains(boxkey) ){
                    return false;
                }


                set.add(rowkey);
                set.add(colkey);
                set.add(boxkey);



            }

        }
        return true;
        
    }
}
