class Solution(object):
    def evalRPN(self, tokens):
        stack = []
        operator = {'+', '-', '*', '/'}
        for c in tokens:
            if c not in operator:
                stack.append(int(c))
            else:
                k = stack.pop()
                l = stack.pop()

                if c == '+':
                    ans = l + k
                elif c == '*':
                    ans = l * k
                elif c == '-':
                    ans = l - k
                else:
                    ans = int(float(l) / k)
                
                stack.append(ans)
        
        return stack.pop()
