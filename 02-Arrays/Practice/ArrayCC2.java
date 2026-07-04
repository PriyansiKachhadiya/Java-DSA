public class ArrayCC2 {
    public static int trappedWater(int height[]) {
        // tc - o(n)
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {

            // water level = min of (left max boundary and right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = water level - height[i]
            trappedWater += (waterLevel - height[i]);

        }
        return trappedWater;

    }

    public static int buyAndSellStocks(int prices[]) {
        // tc - O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void maxSumOfSubArr(int numbers[]) {
        // Brute force method - TC (big oh of n qube)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { // print

                    // subarray sum
                    currSum += numbers[k];

                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("max sum = " + maxSum);

    }

    

    public static void prefix_maxSumofArr(int numbers[]) {
        // time complexity is big oh of n square
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        

        prefix[0] = numbers[0];
        // calculate prefix arrat
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("max sum = " + maxSum);
    }
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum of  all subarrays is" + ms);  
    }
// assignment questions
    public static boolean ques_1(int nums[]){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                   
                }

            }
        }
        return false;
        
    }
    // question 2
    public static int rotated_array_search(int numbers[],int key){
       
            int low = 0, high = numbers.length - 1;
            while(low<= high){
                int mid = low + (high - low)/2;

                if(numbers[mid] == key){
                    return mid;
                }

                if(numbers[low] <= numbers[mid]){ //left part is sorted
                    if(numbers[low] <= key && key <numbers[mid]){
                       high = mid-1;
                    }else{
                        low = mid+1;
                    }
                }else{
                    if(numbers[mid] < key && key < numbers[high]){
                        low = mid + 1;
                        
                    }else{
                        high = mid - 1;
                    }
                }
            }
            return -1;
         
    }

    // question 3
    public static int ques_3(int prices[]){
        int maxprofit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        
        for(int i = 0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                int profit = prices[i] - buyingPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyingPrice = prices[i];
            }
        }
        return maxprofit;

    }
    public static int ques_4(int height[]){
        //find left max boundry array
        int left_max []= new int [height.length];
        left_max[0] = height[0];
        for(int i = 1;i<height.length;i++){
          
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }
        //right max boundry array
        int right_max[] = new int [height.length];
        right_max[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }
        int trappedwater = 0;
        // loop
        for(int i = 0;i<height.length;i++){
                    // waterlevel = min of right max an dlef max
            int waterlevel = Math.min(right_max[i],left_max[i]);
                    // trapped water = waterlevel - height[i]
            trappedwater+= waterlevel - height[i];

        }



        return trappedwater;
    }
    public static void ques_5(int nums[]){
        // int arr[] = {};
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length ;j++){
                for(int k = j+1;k<nums.length;j++){
                  if(nums[i] + nums[j] + nums[k] == 0){
                    
                  }
            
                }
            }
        }
    }

    public static void main(String args[]) {
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int prices[] = {7,1,5,3,2,1,3};
        // int numbers[] = { 4,5,6,7,0,1,2,3 };
        // int key = 4;
        // int prices[] = {7,6,4,3,1};
        int height[] = { 4,2,0,3,2,5};
        // System.out.println(trappedWater(height));
        // System.out.println(buyAndSellStocks(prices) );

        // prefix_maxSumofArr(numbers);
        // kadanes(numbers);
        // System.out.println(rotated_array_search(numbers, 3)));
        System.out.println(ques_4(height)); 
    }

}
