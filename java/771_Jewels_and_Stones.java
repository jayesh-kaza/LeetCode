class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
	for (int i = 0; i < S.length(); i++) {
		if (J.contains(String.valueOf(S.charAt(i)))) {
			count++;
		}
	}

	return count;
    }
}
