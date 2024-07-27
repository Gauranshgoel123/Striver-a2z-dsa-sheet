class Solution{
    static int countMin(String S)
    {
        int n = S.length();
        char[] str = S.toCharArray();
        
        // Create a table of size n*n. table[i][j]
        // will store minumum number of insertions
        // needed to convert str[i..j] to a palindrome.
        int table[][] = new int[n][n];
        int l, h, gap;

        // Fill the table
        for (gap = 1; gap < n; ++gap)
        for (l = 0, h = gap; h < n; ++l, ++h)
            table[l][h] = (str[l] == str[h])?
                           table[l+1][h-1] :
                          (Integer.min(table[l][h-1],
                                 table[l+1][h]) + 1);

        // Return minimum number of insertions
        // for str[0..n-1]
        return table[0][n-1];
    }
}

// This Java program defines a class `Solution` with a static method `countMin` that calculates the minimum number of insertions needed to make a given string `S` a palindrome. Let's break down the code step-by-step:

// ### Method Explanation

// 1. **Initialization:**
//    ```java
//    int n = S.length();
//    char[] str = S.toCharArray();
//    ```
//    - The length of the string `S` is stored in `n`.
//    - The string `S` is converted to a character array `str` for easier access to individual characters.

// 2. **Create the DP Table:**
//    ```java
//    int table[][] = new int[n][n];
//    ```
//    - A 2D array `table` of size `n x n` is created to store the minimum number of insertions needed to convert the substring `str[i..j]` into a palindrome.

// 3. **Fill the Table:**
//    ```java
//    int l, h, gap;

//    for (gap = 1; gap < n; ++gap)
//        for (l = 0, h = gap; h < n; ++l, ++h)
//            table[l][h] = (str[l] == str[h])?
//                          table[l+1][h-1] :
//                          (Integer.min(table[l][h-1], table[l+1][h]) + 1);
//    ```
//    - This nested loop fills the DP table.
//    - The outer loop iterates over the possible lengths of the substrings (`gap`), starting from 1.
//    - The inner loop sets the start (`l`) and end (`h`) indices of the substring based on the current gap.
//    - If the characters at positions `l` and `h` are the same (`str[l] == str[h]`), then the value is taken from the diagonally lower-left cell `table[l+1][h-1]` (no insertion needed here).
//    - If the characters are different, the value is the minimum of the two possible previous states plus one insertion: 
//      - `table[l][h-1]` (inserting a character at the end)
//      - `table[l+1][h]` (inserting a character at the beginning)
//    - This fills the table from shorter to longer substrings.

// 4. **Return the Result:**
//    ```java
//    return table[0][n-1];
//    ```
//    - Finally, the method returns the value stored in `table[0][n-1]`, which represents the minimum number of insertions needed for the entire string `str[0..n-1]`.

// ### Example

// For the string "ab":
// - The DP table will be filled as follows:
//   ```
//   table = [
//     [0, 1],
//     [0, 0]
//   ]
//   ```
//   - `table[0][1] = 1` because we need one insertion to make "ab" a palindrome ("aba" or "bab").

// Thus, the method returns `1` for the string "ab".

// ### Summary
// The method uses dynamic programming to calculate the minimum number of insertions required to convert a given string into a palindrome. The 2D table stores intermediate results to avoid redundant calculations, making the algorithm efficient.
