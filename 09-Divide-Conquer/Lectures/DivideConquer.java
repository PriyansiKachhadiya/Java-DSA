public class DivideConquer {

   public static void printArr(String arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void mergeSort(int arr[], int si, int ei) {
      // time complexity o(nlogn) space-complexity o(n)
      if (si >= ei) {
         return;
      }

      // kaam
      int mid = si + (ei - si) / 2; // (si+ei)/2 both are same but first one will work on large arrays
      mergeSort(arr, si, mid); // left part
      mergeSort(arr, mid + 1, ei); // right part
      
      merge(arr, si, mid, ei);
   }

   public static void merge(int arr[], int si, int mid, int ei) {
      int temp[] = new int[ei - si + 1]; // temp array of size same as array
      int i = si; // iterator for left part
      int j = mid + 1;// iterator for right part
      int k = 0;// iterator for temp array

      while (i <= mid && j <= ei) {
         if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;

         } else {
            temp[k] = arr[j];
            j++;

         }
         k++;
      }
      // left part
      while (i <= mid) {
         temp[k++] = arr[i++];
      }
      // rigjt part
      while (j <= ei) {
         temp[k++] = arr[j++];
      }
      // copy temp array to original array
      for (k = 0, i = si; k < temp.length; k++, i++) {
         arr[i] = temp[k];
      }
   }

   public static void quickSort(int arr[], int si, int ei) {

      if (si >= ei) {
         return;
      }
      // last element -- pivot
      int pivotIndex = partition(arr, si, ei); // pivo thi partition kri left part
      quickSort(arr, si, pivotIndex - 1); // left part
      quickSort(arr, pivotIndex + 1, ei); // right part

   }

   public static int partition(int arr[], int si, int ei) {
      int pivot = arr[ei];
      int i = si - 1; // to make place for element which is smaller than pivot

      for (int j = si; j < ei; j++) {
         if (arr[j] <= pivot) {
            i++;

            // swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
         }
      }
      i++;
      int temp = pivot;
      arr[ei] = arr[i];
      arr[i] = temp;
      return i;

   }

   // public static void stringMergeSort(String str1[], int si, int ei) {

   // if (si >= ei) {
   // return;
   // }

   // int mid = si + (ei - si) / 2;

   // stringMergeSort(str1, si, mid);
   // stringMergeSort(str1, mid + 1, ei);

   // stringMerge(str1, si, mid, ei);

   // }

   // public static void stringMerge(String str1[], int si, int mid, int ei) {
   // int i = si; // iterator for left part
   // int j = mid + 1; // iterator for right part
   // int k = 0; // iterator for temp array

   // String temp[] = new String[ei-si+1];

   // while (i <= mid && j<= ei) {
   // if(str1[i].compareTo(str1[j]) <= 0){
   // temp[k++] = str1[i++];

   // }else{
   // temp[k++] = str1[j++];

   // }

   // }
   //

   // while(i <= mid){
   // temp[k++] = str1[i++];
   // }
   // while (j<= ei) {
   // temp[k++] = str1[j++];
   // }

   // // copy temp array to original array
   // for (k = 0, i = si; i <=ei; k++, i++) {
   // str1[i] = temp[k];
   // }

   // }
   public static void stringMergeSort(String str1[], int si, int ei) {
      if (si >= ei) {
         return;
      }

      int mid = si + (ei - si) / 2;

      stringMergeSort(str1, si, mid);
      stringMergeSort(str1, mid + 1, ei);

      stringMerge(str1, si, mid, ei);
   }

   public static void stringMerge(String str1[], int si, int mid, int ei) {
      int i = si; // Iterator for left part
      int j = mid + 1; // Iterator for right part
      int k = 0; // Iterator for temp array

      String temp[] = new String[ei - si + 1];

      // Merge the two parts into temp
      while (i <= mid && j <= ei) {
         if (str1[i].compareTo(str1[j]) <= 0) {
            temp[k++] = str1[i++];
         } else {
            temp[k++] = str1[j++];
         }
      }

      // Copy remaining elements of the left part, if any
      while (i <= mid) {
         temp[k++] = str1[i++];
      }

      // Copy remaining elements of the right part, if any
      while (j <= ei) {
         temp[k++] = str1[j++];
      }

      // Copy sorted elements from temp back to original array
      for (k = 0, i = si; i <= ei; i++, k++) {
         str1[i] = temp[k];
      }
   }

   // find majortiy element
   // brute force O(n^2)
   static int majorEle(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         int count = 0;
         for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               count++;
            }
         }
         if (count > arr.length / 2) {
            return arr[i];
         }
      }
      return -1;
   }

   // boyer moore voting algorithm O(n) space O(1)
   static int booyerMore(int arr[]) {
      int candidate = arr[0];
      int count = 0; // number of times elements appear in array as compare to other element

      for (int element : arr) {
         if (count == 0) {
            candidate = element;

         }

         if (element == candidate) {
            count++;
         } else {
            count--;
         }
      }

      return candidate;

   }

   static int inversionCount(int arr[]) {
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
               count++;
            }
         }
      }

      return count;
   }

   // by using merge sort we can count inversion in O(nlogn) complexity
   static int mergeSortAndCount(int[] arr, int[]temp, int left, int right){
      int mid , invCount = 0;
      if(left < right){
         mid  = (left + right)/2;

       invCount += mergeSortAndCount(arr, temp, left, mid);
       invCount+= mergeSortAndCount(arr, temp, mid+1, right);
       invCount += mergeAndCount(arr,temp,left,mid,right);
      }
      return invCount;
   }

   static int mergeAndCount(int arr[] , int temp[] , int left , int mid,int  right){
     int i = left; // iterator for left subarray
     int j = mid+1; // iterator for right subarray
     int k = left; // starting index to be soorterd
     int invCount = 0;

     while (i<=mid && j<= right) {
      if(arr[i] <= arr[j]){
         temp[k++] = arr[i++];
      }else{
         temp[k++] = arr[j++];
        
          // count inversions
      }
     }

     while(i<=mid){
      temp[k++] = arr[i++];
     }
     while(j<=right){
      temp[k++] = arr[j++];
     }

     for( i = left;i<= right;i++){
      arr[i] = temp[i];
     }
     return invCount;
   }

   public static void main(String args[]) {
      // String str1[] = { "sun", "earth", "mars", "mercury" };
      // stringMergeSort(str1, 0, str1.length - 1);
      // printArr(str1);
     int arr1[] = {2,4,1,3,5};
    int inCount =   inversionCount(arr1);
    System.out.println(inCount);
   }
}
