class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack=[]
        closenopen={'}':'{',']':'[',')':'('}
        for c in s:
            if c in closenopen:
                if stack and stack[-1]==closenopen[c]:
                    stack.pop()
                else:
                    return False 
            else:
                stack.append(c) 
        return len(stack)==0
        # for i in range(len(s)):
        #     if (s[i]=='('or s[i]=='['or s[i]=='{'):
        #         stack.append(s[i])
        #     elif(stack[-1]==s[i]):
        #         stack.pop()
        #     else:
        #         stack.append(s[i])
        
        # return len(stack)==0