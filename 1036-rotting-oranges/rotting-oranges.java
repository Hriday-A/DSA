class Solution {
    int[][] dirs;
    int m,n;
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>(); // used for bsf
        this.m = grid.length; 
        this.n = grid[0].length;
        int fresh=0;
        this.dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};

        //1. Finding starting element and add in the Queue
        //2. Maintain a counter for tracking other elements that we need to parse throu
            // Eg- no. of courses in the course reg sum 
            // here it is fresh 
        for(int i=0;i<m; i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j}); // finding values of "all" rotten oranges for my bsf 
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int time=0;
        if(fresh==0) return time;

        while(!q.isEmpty()){
            int size = q.size();
            time++;
            for(int i=0;i<size;i++){
                int[] curr= q.poll();
                for(int[] dir:dirs){
                    int r= curr[0]+dir[0];
                    int c = curr[1]+dir[1];
                    if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==1){
                        grid[r][c]=2;
                        q.add(new int[]{r,c});
                        fresh--;
                        if(fresh==0) return time;
                    }
                }
            }
        }
        return -1;
    }
}