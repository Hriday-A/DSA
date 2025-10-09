class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        stack=[]
        rest=[]
        
        def backtracking(openn,closen):
            if openn==closen==n:
                rest.append(''.join(stack))

            if openn<n:
                stack.append('(')
                backtracking(openn+1,closen)
                stack.pop()
            if closen<openn:
                stack.append(')')
                backtracking(openn,closen+1)
                stack.pop()

        backtracking(0,0)
        return rest
