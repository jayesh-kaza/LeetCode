class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i=0;
        for(int k=0;k<A.length;k++)
            if((A[k]&1)==0)
            {
                int temp = A[k];
                A[k] = A[i];
                A[i] = temp;
                i++;
            }
            
        return A;
    }
}
