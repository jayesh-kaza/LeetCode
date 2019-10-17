class Solution {
    public boolean stoneGame(int[] piles) {
        int ans = 0;
        for(int i=0;i<piles.length;i++)
            ans = ans ^ piles[i];
        return ans==0?false:true;
    }
}
