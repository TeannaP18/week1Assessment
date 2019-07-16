package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }


    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] response = new String[stringArray.length];
        int reverseArrayIndex = 0;
        for(int arrayIndex= stringArray.length-1; arrayIndex>= 0; arrayIndex--){
            response[reverseArrayIndex] = stringArray[arrayIndex];
            reverseArrayIndex++;
        }
        return response;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}