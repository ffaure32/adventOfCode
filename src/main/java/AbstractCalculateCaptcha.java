/**
 * Created by ffaure32 on 01/12/2017.
 */
public abstract class AbstractCalculateCaptcha {
    public int calculate(String input) {
        int resultat = 0;
        for (int i = 0; i < input.length(); i++) {
            resultat += getResultat(input.charAt(i), getCharToCompare(input, i));
        }
        return resultat;
    }

    protected abstract int getCharToCompareIndex(String input, int i);

    private char getCharToCompare(String input, int i) {
        i = getCharToCompareIndex(input, i);
        return input.charAt(i);
    }

    private int getResultat(char lastChar, char firstChar) {
        if(lastChar == firstChar) {
            return Character.getNumericValue(firstChar);
        }
        return 0;
    }
}
