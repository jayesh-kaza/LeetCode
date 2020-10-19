class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0;
        for(int i=0;i<mat.size();i++){
            sum=sum+mat[i][i];
            if(i!=mat.size()-1-i)
                sum=sum+mat[mat.size()-1-i][i];
        }
        return sum;
    }
};
