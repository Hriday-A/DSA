class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        k=[0]*26
        p=[0]*26 
        if (len(s)==len(t)):
            for i in range(len(s)):
                k[ord(s[i])-ord('a')]+=1
                p[ord(t[i])-ord('a')]+=1
            return k==p
        return False
        