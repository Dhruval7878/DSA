class Solution {
    static int findMax(int[] arr){
        int maxAns = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxAns){
                maxAns = arr[i];
            }
        }
        return maxAns;
    }
    
    static int calculateTotalHours(int[] arr,int H){
        int totalH = 0;
        for(int i=0;i<arr.length;i++){
            totalH += Math.ceil((double) arr[i] / (double) H);
        }
        return totalH;
    }
    
    public static int Solve(int N, int[] piles, int H) {
        int low = 1;
        int high = findMax(piles);
        while(low<=high){
            int mid = (low+high)/2;
            int totalH = calculateTotalHours(piles,mid);
            if(totalH <= H)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}