class Solution:
    def hammingWeight(self, n: int) -> int:
        check = 1
        count = 0

        while n > 0:
            if check & n:
                count += 1
            n = n >> 1
        return count