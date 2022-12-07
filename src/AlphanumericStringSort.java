import java.util.Arrays;

public class AlphanumericStringSort {

    public static final String INPUT_EXCEPTION_MESSAGE = "String needs to be non-null ASCII String";

    public String sort(String input) throws IllegalArgumentException {

        if (!(input != null && input.chars().allMatch(Character::isLetterOrDigit))) {
            throw new IllegalArgumentException(INPUT_EXCEPTION_MESSAGE);
        }
        StringBuilder result = new StringBuilder(),
                lower = new StringBuilder(),
                upper = new StringBuilder(),
                evens = new StringBuilder(),
                odds = new StringBuilder();

        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        String sortedString = new String(chars);

        for (int i = 0; i < sortedString.length(); i++) {
            char ch = sortedString.charAt(i);
            if(Character.isLowerCase(ch)) {
                lower.append(ch);
            } else if (Character.isUpperCase(ch)) {
                upper.append(ch);
            }  else if (Character.isDigit(ch)) {
                int dig = Character.digit(ch, 10);
                if (isEven(dig)) {
                    evens.append(ch);
                } else {
                    odds.append(ch);
                }
            }
        }
        return result.append(lower).append(upper).append(evens).append(odds).toString();
    }

    private static boolean isEven(int digit) {
        return digit % 2 == 0;
    }

}
