class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i =0; i<indices.length; i++){
            for(int j=0; j<n; j++){
                arr[indices[i][0]][j] +=1;
            }
            for(int k=0; k<m; k++){
                arr[k][indices[i][1]] +=1;
            }
        }
        int total = 0;
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]%2!=0)total+=1;
            }
        }
        return total;
    }
}