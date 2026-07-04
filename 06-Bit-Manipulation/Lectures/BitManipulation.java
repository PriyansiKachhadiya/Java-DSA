import java.util.*;

public class BitManipulation {
   public static void oddOrEven(int n){
      // bit mask is a number with which we perform and operation with binary number
      //logic is LSB is 1 then number is odd and if LSB(0th bit(last bit of binary number) ) is 0 then number is even
      // for check LSB of number we need to perform (& - and) operation with 1 
      int bitMask = 1;
      if((n & bitMask) == 0){
         //even number
         System.out.println("even number");
      }else{
         System.out.println("odd number");
      }
   }
   public static int getIthBit(int n,int i){
      // for find i th bit of number we have to perform & operation with (1<<i)
      // why coz we have to convert every bit of binary number 0 except one bit which is i 
      int bitMask = 1<<i;
      if((n & bitMask) == 0){
         return 0;
      }
      else{
         return 1;
      }
   }
   public static int setIthBit(int n, int i){
      //replace i th bit with 1
      int bitMask = 1<<i;
      return n | bitMask;
   }
   
   public static int clearIthBit(int n,int i){
      // replace i th bit with 0
      int bitMask = ~(1<<i);
      return n & bitMask;

   }
   public static int updateIthBit(int n, int i, int newBit){
      // aproach 1
   //  if(newBit == 0){
   //    return clearIthBit(n, i);
   //  }else{
   //    return setIthBit(n, i);
   //  }

   //aproach 2
    n = clearIthBit(n, i);
   int bitMask = newBit <<i;
   return n| bitMask;
// same time complexity in both aproach
   }
   public static int clearIBits(int n, int i){
      // coz left shift with -1 will convert bit mask as we want -- right to i th bits will be 0 so if we perfom and operation with actual number it will clear 0 to i bits and rest of bits will be same as it is
      int bitMask = (~0)<<i;
      return n & bitMask;
   }
   public static int clearBitsInRange(int n, int i, int j){
// see scrrenshot for understand bit mask logic 
      int a = ((~0)<<(j+1));
      int b = (1<<i)-1;

      int bitMask = a|b;
      return n & bitMask;
   }
   public static boolean isPowerOfTwo(int n){
      //see scrrenshot for logic
      return (n&(n-1)) == 0;
   }
   // count set bits in number(count  number of bits which is 1)
   // question asked by google and amazon
   // for any number N --- number of bits in its binary representation is always will be (logn base 2) [log2^n + 1]
   public static int countSetBits(int n){
      int count = 0;
      while(n>0){
         if((n&1)!= 0){
            count++;
         }
         n = n>>1;
      }
      return count;
   }

   // fast exponentian is thing like
   // basically to find exponentian of any number(suppose number is a) basically it take O(n) (where n is equal to power of number a)time complexity
   //but by this method we are gonna find a way which take less time than basic method (o(logn))
   public static int fastExp(int a , int n){
      int ans = 1;
      while (n>0) {
         if((n&1) != 0){ //check LSB
           ans = ans * a;
         }   
         a = a*a;
         n= n>>1;
      }
      return ans;
   }
   public static int modularExpo(int a, int n, int m ){
      int ans = 1;
      a = a %m;
      while(n>0){
         if((n&1) != 0){
            ans = (ans * a)%m;
         }
         a = (a*a)%m;
         n = n>>1;
      }
      return ans;
   }
   //assignment questions
   // question 1 -- answer 0;
   //question - 2 //swap variables without any third party variable
   public static void swapnumbers(int a,int b){
      System.out.println("value of a before"+ a);
      System.out.println("value of b before "+ b);
      a = a ^ b;
      b = a ^ b; // b = a ^ b = (a ^ b) ^ b = a
      a = a ^ b; // a = a ^ b = (a ^ b) ^ a = b
      System.out.println("value of a after "+ a);
      System.out.println("value of b after "+ b);
   }
   //question 3 - add one to the integer with bit manipulation
    public static int addOne(int n){
      return -~n;
    }
    // question 4
    public static void converlowercase(char ch){
       System.out.println((char)(ch | 32));
    }
   public static void main(String args[]){
   //  System.out.println((5 & 6));
   //  System.out.println(5 | 6);
   //  System.out.println(5 ^ 6);
   //  System.out.println(~5);
   //  System.out.println(~0);
   //  System.out.println(5<<2);
   //  System.out.println(5>>2);
   // oddOrEven(3);
   // oddOrEven(14);
   // oddOrEven(23);
//   System.out.println(setIthBit(10, 2)); 
//   System.out.println(fastExp(5, 3));
// System.out.println(modularExpo(8, 6, 2));
// swapnumbers(5, 6);
 System.out.println(addOne(7));

 // convert uppercase character to lowercase
 converlowercase('A');
 converlowercase('B');


   } 
}
