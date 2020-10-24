#speed   : O(n)
#memory  : O(n)
#runtime : 94.81%
#memory  : 100%

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        length = len(nums) + 2
        lookUp = [0] * (length)
        for i in nums:
            if 0 < i < length:
                lookUp[i] = 1

        for i in range(1, length):
            if not lookUp[i]:
                return i
        return length + 1
