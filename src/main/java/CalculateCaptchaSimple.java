/**
 * Created by ffaure32 on 01/12/2017.
 */
public class CalculateCaptchaSimple extends AbstractCalculateCaptcha {

    protected int getCharToCompareIndex(String input, int i) {
        i++;

        if(i >= input.length()) {
            i = 0;
        }
        ;
        return i;
    }

}
