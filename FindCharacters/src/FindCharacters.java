import java.util.ArrayList;
import java.util.List;

/**
 LeetCode link: https://leetcode.com/problems/find-words-containing-character/submissions/
 You are given a 0-indexed array of strings words and a character x.

 Return an array of indices representing the words that contain the character x.

 Note that the returned array may be in any order.

 Example 1:
 Input: words = ["leet","code"], x = "e"
 Output: [0,1]
 Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

 Example 2:
 Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
 Output: [0,2]
 Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

 Example 3:
 Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
 Output: []
 Explanation: "z" does not occur in any of the words. Hence, we return an empty array.


 Constraints:

 1 <= words.length <= 50
 1 <= words[i].length <= 50
 x is a lowercase English letter.
 words[i] consists only of lowercase English letters.
 */


public class FindCharacters {

    public static List<Integer> findWordsContaining(String[] words, char x) {

        // create the array to be returned
        List<Integer> output = new ArrayList();

        //iterate through the incoming array of 'words'
        //hint: for loops syntax -  for(start index; end index; increment value)
        for(int i = 0; i < words.length; i++){


            //once you access a word from the 'words' array
            //iterate through the word itself to get access to each character
            //hint: you'll access the word using the current index 'i'
            for(int j = 0; j < words[i].length(); j++){



                //check each character and compare it to 'x' to see if they are equal
                // hint: you can use the '.charAt(index)' function on a string.
                // However be mindful of which index you are using.
                if(words[i].charAt(j) == x){


                    //if the characters are equal
                    //add the current index of the 'words' array to the output array
                    output.add(i);

                    //in case of a word having multiples of a letter in a word
                    //break out of the loop to continue onto the next word in the 'words' array
                    break;
                }
            }

        }

        return output;
    }



}
