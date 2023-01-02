import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        35. Search Insert Position
//        Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
//
//                You must write an algorithm with O(log n) runtime complexity.

//        class Solution {
//            public int searchInsert(int[] nums, int target) {
//                int pos =  Arrays.binarySearch(nums,target);
//                int pos2=0;
//                if (pos>0){
//                    System.out.println(pos);
//                    pos2 = pos;
//                }
//                else if(pos< 0) {
//                    System.out.println(Math.abs(pos) - 1);
//                    pos2 = Math.abs(pos) - 1;
//                }
//
//                return pos2;
//            }
//        }


    }
//744. Find Smallest Letter Greater Than Target
//    You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
//    There are at least two different characters in letters.
//
//    Return the smallest character in letters that is lexicographically greater than target.
//    If such a character does not exist, return the first character in letters.
//    public char nextGreatestLetter(char[] letters, char target) {
//        char a = 'a';
//        char next;
//        for (int i = 0; i < letters.length; i++) {
//            // System.out.println(letters[i]);
//            if (target == letters[i]) {
//                a = letters[i + 1];
//                System.out.println(a);
//                break;
//            }
//            else if (target != letters[i]) {
//                a = letters[0];
//                break;
//            }
//
//        }
//        return a;



//        367. Valid Perfect Square
//        Given a positive integer num, return true if num is a perfect square or false otherwise.
//
//                A perfect square is an integer that is the square of an integer.
//                In other words, it is the product of some integer with itself.
//
//        You must not use any built-in library function, such as sqrt.
//
//        public boolean isPerfectSquare(int num) {
//
//            long lo=1,hi=num;
//
//            while(lo<=hi)
//            {
//                long mid=lo+(hi-lo)/2;
//                if(mid*mid==num) return true;
//                else if(mid*mid>num) hi=mid-1;
//                else lo=mid+1;
//            }
//            return false;
//        }









    }
}