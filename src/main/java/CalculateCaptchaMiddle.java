/**
 * Created by ffaure32 on 01/12/2017.
 */
public class CalculateCaptchaMiddle extends AbstractCalculateCaptcha {

    protected int getCharToCompareIndex(String input, int i) {
        i += input.length() / 2;

        if(i >= input.length()) {
            i = i - input.length();
        }
        ;
        return i;
    }

}
