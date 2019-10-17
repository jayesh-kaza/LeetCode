class Solution {
    public int repeatedNTimes(int[] A) {
        int n = A.length/2;
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(!myMap.containsKey(A[i]))
                myMap.put(A[i],1);
            else
                myMap.put(A[i],myMap.get(A[i])+1);
            if(myMap.get(A[i])==n)
                return A[i];
        }
        return -1;
        
    }
}
