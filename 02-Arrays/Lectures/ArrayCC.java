// import java.util.*;
public class ArrayCC {
    public static void update(int array[]){
        for(int i=0;i<array.length;i++){
            array[i] = array[i]+1;

        }
    }
    
    public static String linearSearch(String strings[],String key){
        for(int i=0;i<strings.length;i++){
            if(strings[i] == key){
                return "found";
            }
            
        }
        return "not found";
        // time complexity is big oh of n
    }
    public static int getLargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;  
        
        for(int i =0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int binarySearch(int numbers[],int key){
        int start =0 , end = numbers.length-1;
        while (start <= end) {
           int mid = (start + end)/2; 

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
        // time complexity is Big oh of long(n)
    }
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        // time complexity - n
        // space complexity - 1
    }
    public static void printPairs(int numbers[]){
        int tp =0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total numbers of pairs" + tp);
        // time complexity is big oh of (square of n)
    }
    public static void printSubArray(int numbers[]){
        int ts=0;

        for(int i=0;i<numbers.length;i++){
            int start = i;  
            
            
            for(int j = i;j<numbers.length;j++){
                int end = j;
             
                for(int k= start;k<=end;k++){ 
                    // print
                    
                    System.out.print(numbers[k]+" ");
                    // subarray
                
                    
                }

                ts++;

                 
                
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
      
    }
    public static void main(String args[]){
     
     int numbers[] = {1,2,3,4,5,6,-6};
    //  System.out.println(getLargestNumber(numbers));
    //  System.out.println("index for key is" + binarySearch(numbers, 90));
    //  reverse(numbers);

    // //  print numbers
    //  for(int i = 0;i<numbers.length;i++){
    //     System.out.print(numbers[i]+" ");
    //  }
    //  System.out.println();
      
 
    // }
    // printPairs(numbers);
    printSubArray(numbers);
    }
}
