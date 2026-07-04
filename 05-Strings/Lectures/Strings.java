import java.util.*;



public class Strings {
    public static void printLetters(String name){
        for(int i = 0;i<name.length();i++){
           System.out.print(name.charAt(i) + " ");
        }
    }
    public static boolean isPalindrome(String str){
        for(int i = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
             return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path){
        // see screenshot for logic of equation of shortest distance
        int x = 0, y = 0;
        for(int i = 0;i<path.length();i++){
            char dir = path.charAt(i);
            // south
            if(dir == 'S'){
                y--;

            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
             
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static String subString(String str, int si,int ei){
        String  substr = "";
        for(int i = si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }
    public static String compress (String str){
        //time complexit O(n)
        String newstr = "";
        for(int i = 0;i<str.length();i++){
           Integer count = 1;
           while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
            count++;
            i++;
           }
           newstr += str.charAt(i);
           if(count > 1){
            newstr += count.toString();
           }
        }
        return newstr;
    }
    public static String compressUsingBuilder(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ;i<str.length();i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ){

                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    //assignment questions
    public static int ques_1(String str){
       char vowels[] = {'a','e','i','o','u'};
       int count = 0;
        for(int i =0;i<str.length();i++){
            for(int j = 0;j<vowels.length;j++){
                if(str.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void ifAnagram(String str1, String str2){
    
    //     for(int i = 0;i<str1.length();i++){
    //         boolean anagram = false;
    //         for(int j = 0;j<str2.length();j++){
    //             if(str1.charAt(i) == str2.charAt(j)){
    //                 anagram = true;
    //                 i++;
    //                 break;
    //             }else{
    //                 j++;
    //             }
    //         }
    //         if(anagram == false){
    //             return false;
    //         }
    //     }
    //   return true;

    //it iterate all char of str1 and str2  and check each character of str1 with each char of str2, if any character of str1 not inclueds in str2 then it wil break and returhn false vise versa
    if(str1.length() == str2.length()){
      str1 =  str1.toLowerCase();
      str2 =  str2.toLowerCase();

      // it create both string into lowercase

        char str1Array[] = str1.toCharArray();
        char str2Array[] = str2.toCharArray();

        //it create array of character of strings

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        

        if(Arrays.equals(str1Array,str2Array)){
            System.out.println("string arr anagram");
        }else{
            System.out.println("strings are not anagram");
        }
    }else{
        System.out.println("strings are not anagram");
    }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = "nehali";
        String str2 = "haneil";
        sc.close(); 
        // System.out.println(ifAnagram(str1, str2));
        // System.out.println(ques_1(str));

    //  String str = "aaaabbbccddeff";
    //  System.out.println(compressUsingBuilder(str));
    //  System.out.println(toUpperCase(str));

       /**  StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch);

        }
        output will be abcdefghijklmnopqrstuvwxyz
         time complexity - O(26) in string builder
         in string this same operations time comoplexity will be O(n^2)
            */




    // String str = "abcdefgh";
    // char arr[] = {'a','b','c','d'};
    // String str2 = new String("xyz");
    // string are immutable 

    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // sc.next only take one word of string ... if we type "tony stark" as a input in terminal it will only print tony
    // System.out.println(name);
    // System.out.println(name.length());
    // in string length is a function so we need to add paranthesis in it , in array length is property 

    // concatenation
    // String firstName = "priyansi";
    // String lastName = "kachhadiya";
    // String fullName = firstName + " " + lastName;
    // System.out.println(fullName);

    //charat
    // System.out.println(fullName.charAt(2));
    // printLetters(fullName);
    // String str = "HelloWorld";
    // String fruits[] = {"apple","banana","mango"};
    // String largest = fruits[0];
    // for(int i = 1;i<fruits.length;i++){
    //     if(largest.compareTo(fruits[i]) <0){
    //         largest = fruits[i];
    //     }
    // }
    // System.out.println(la);
    // System.out.println(subString(str, 0, 4));
    //default method for substring
    // str.substring(0,5);
    
    // String path = "WNEENESENNN";
    // System.out.println(isPalindrome(str));
    // System.out.println(getShortestPath(path));
}
}
