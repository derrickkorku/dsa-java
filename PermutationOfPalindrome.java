/**
 * Algorithm to find if a string is a permutation of palindrome
 */
public class PermutationOfPalindrome {
    public static boolean isPermutationOfPalindrome(String str){
        int[] table = buildCharaterfrequencyTable(str);
        return checkCharacterFrequencyTable(table);
    }

    private static int[] buildCharaterfrequencyTable(String str){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        char[] charTable = str.toCharArray();

        for(char c: charTable){
            int val = getCharNumber(c);

            if (val != -1){
                table[val]++;
            }
        }

        return table;
    }

    private static int getCharNumber(char c){
        int aVal = Character.getNumericValue('a');
        int zVal = Character.getNumericValue('z');
        int cVal = Character.getNumericValue(c);

        if (cVal >= aVal && cVal<= zVal ){
            return cVal - aVal;
        }

        return -1;
    }


    private static boolean checkCharacterFrequencyTable(int[] table){
        boolean oddFound = false;

        for(int t : table){
            if (t % 2 == 1){
                if (oddFound){
                    return false;
                }
                oddFound = true;
            }
        }

        return true;
    }
}
