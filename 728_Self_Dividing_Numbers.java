class Solution {
    
    public boolean check(int i)
    {
        int num = i;
        while(i!=0)
        {
            int x = i%10;
            if(x== 0|| num%x!=0)
                return false;
            i = i/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(check(i))
                ans.add(i);
        return ans;
    }
}
