class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int rowBegin = 0, rowEnd = matrix.length-1;
        int colBegin = 0, colEnd = matrix[0].length - 1;

        while(rowBegin<= rowEnd && colBegin <= colEnd){
            //Traverse right
            for(int j=colBegin;j<=colEnd;j++){
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            //Traverse Down
            for(int j=rowBegin;j<=rowEnd;j++){
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            //Traverse Left
            if(rowBegin<=rowEnd){
            for(int j=colEnd;j>=colBegin;j--){
                res.add(matrix[rowEnd][j]);
            }
            }
            rowEnd--;


            //Traverse Up
            if(colBegin<=colEnd){
                for(int j=rowEnd;j>=rowBegin;j--){
                res.add(matrix[j][colBegin]);
            }
            }
            colBegin++;
        }
        return res;
    }
}