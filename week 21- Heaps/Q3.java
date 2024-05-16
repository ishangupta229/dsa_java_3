public class Q3 {

    static class info{
        int data;
        int [] pos;

        info(int data,int i,int j){
            this.data=data;
            this.pos = new int[] {i,j};
        }
    }

    public static void travers(int [][] nums) {
        Boolean [][] vis = new Boolean[nums.length][nums[0].length];
        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[0].length; j++) {
                vis[i][j] = false;                
            }
        }
        int cost=nums[0][0];
        vis[0][0] = true;

        // min(nums, vis,0,0);
    }
    private static void min_val(int [][] nums, boolean[][] vis,int i, int j, int curr){
        

    }
    public static void min(int [][] nums, boolean[][] vis,int i, int j, int curr) {
        if(i==nums.length && j==nums[0].length){
            return;
        } 
        
        char a = 't'; 
        if (i-1>=0) {
            int top = curr + nums[i-1][j];
        }
        if(i+1<nums.length){
            int bottom = curr + nums[i+1][j];
            if(bottom<top){
                a = 'b';
            }
        }
        if (j-1>=0) {
            int left = curr + nums[i][j-1];
        }
        if(j+1<nums[0].length){
            int right = curr + nums[i][j+1];
        }
        

        
    }
    public static void main(String[] args) {
        int [][] input = { 
            { 31, 100, 65, 12, 18 },
            { 10, 13, 47, 157, 6 },
            { 100, 113, 174, 11, 33 },
            { 88, 124, 41, 20, 140 },
            { 99, 32, 111, 41, 20 } 
        };


    }
}
