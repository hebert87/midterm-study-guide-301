
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this

        int minNum = nums[0];
        int maxNum = nums[0];

        for(int i=0 ; i< nums.length; i++){
            if (nums[i] > maxNum){
                maxNum = nums[i];
            }else if (nums[i] < minNum){
                minNum = nums[i];
            }
        }
        return maxNum -minNum;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    //Find the longest word that starts with a specific character letter in: The values of a HashMap
    public static String longestWord(HashMap<String , String> map, char letter){
        String longestWord = "";
        for (String word : map.values()) {
            if( word.length() > 0 && word.charAt(0) == letter && word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
    //Count how many words are longer than n characters and shorter than m characters in:
    public static int countWords (ArrayList<String> words ,int n, int m ) {
        
        int totalWords = 0;

        for(int i = 0; i< words.size(); i++){

            String word = words.get(i);

            if (word.length()> n && word.length()< m){
                totalWords += 1;
            } 
        }
        return totalWords;
        
    }

    //Find the difference between the how many odd and even numbers there are in: A HashSet

    public static int differenceInOddEven (HashSet<Integer> nums){
        int odd = 0;
        int even = 0;
        
        for ( int num : nums){
            if (num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.abs(odd - even);
    }
    //Find the second-largest number in: The keys of a HashMap

    public static int secondLargestNum (HashMap<Integer, Integer> map){
        int largestNum = 0;
        int secondLargest = 0;

        for(int num : map.keySet()){
            if( num > largestNum){
                secondLargest = largestNum;
                largestNum = num;
            }else if (num != largestNum && num > secondLargest){
                secondLargest = num;
            }

        }return secondLargest;

    }


}