class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxLeft=[]
        maxR=[]
        counter=0
        n = len(height)

        for i in range(n):
            if maxLeft:
                current_max = max(maxLeft[-1], height[i])
                maxLeft.append(current_max)
            else:
                maxLeft.append(height[i])

        maxR_temp = []
        for i in range(n - 1, -1, -1):
            if maxR_temp:
                current_max = max(maxR_temp[-1], height[i])
                maxR_temp.append(current_max)
            else:
                maxR_temp.append(height[i])

        maxR = maxR_temp[::-1]
        
        for i in range(n):
            curr = height[i]
            water_level = min(maxLeft[i], maxR[i])
            check = water_level - curr
            
            if check > 0:
                counter += check
        
        return counter
