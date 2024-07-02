class Solution:
    def addDigits(self, num: int) -> int:
        new_num = str(num)

        while(len(new_num) > 1):
            new_num = str(sum([int(num) for num in new_num]))
        return int(new_num)