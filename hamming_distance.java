// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, return the Hamming distance between them.

 

// Example 1:

// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
      //  ↑   ↑
// The above arrows point to positions where the corresponding bits are different.
// Example 2:

// Input: x = 3, y = 1
// Output: 1
 

// Constraints:

// 0 <= x, y <= 231 - 1

//My answer
class Solution {
    public int hammingDistance(int x, int y) {
      int n=(~x & y) | (x & ~y);
      int hamming_distance=0;
      while(n!=0)
      {
        n=n&(n-1);
        hamming_distance++;
      }
      return hamming_distance;  
    }
}

//The best answer I found in Leetcode
class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x>0||y>0)
        {
            if(x%2!=y%2)count++;
            x/=2;
            y/=2;
        }
        return count;
    }
}

