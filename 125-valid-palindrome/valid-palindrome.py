class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        c1=[]
        s = ''.join(c.lower() for c in s if c.isalnum()) 
        length=len(s)
        for i in range(length//2):
            if s[i]!= s[length-i-1]:
                return False
        return True 
