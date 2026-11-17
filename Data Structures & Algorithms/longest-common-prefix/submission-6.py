class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0: 
            return
        min = len(strs[0])

        for str in strs:
            if(len(str) < min):
                min = len(str)
        
        prefix = []

        for i in range(min):
            for j in range(len(strs) - 1):
                if(strs[j][i] != strs[j+1][i]):
                    return "".join(prefix)
            prefix.append(strs[0][i])

        return "".join(prefix) 

        