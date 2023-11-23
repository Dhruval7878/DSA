class SearchInsertK {
    static int searchInsertK(int Arr[], int N, int k) {
        // code here
        int low = 0;
        int high = Arr.length - 1;
        int ans = Arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}