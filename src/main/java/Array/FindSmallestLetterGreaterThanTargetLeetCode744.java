package Array;

public class FindSmallestLetterGreaterThanTargetLeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        FindSmallestLetterGreaterThanTargetLeetCode744 ms = new FindSmallestLetterGreaterThanTargetLeetCode744();
        System.out.println(ms.nextGreatestLetter(letters,target));
    }

    /**
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0; i<letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }

    /**
     * TRY DOING WITH BST:
     */

}
