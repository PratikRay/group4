package home;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/2/2016.
 */
public class redditTest extends Base {

    @Test
    public void createAccount() throws InterruptedException {
        clickByCss(".login-required");
        typeByCss("#user_reg", "throwaway123456789");
        typeByCss("#passwd_reg", "password1234");
        typeByCss("#passwd2_reg", "password1234");
        clickByCss("#rem_reg");
        sleepFor(5);



    }


}
