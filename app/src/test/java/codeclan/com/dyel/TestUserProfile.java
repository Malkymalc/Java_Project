package codeclan.com.dyel;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by user on 09/01/2018.
 */

public class TestUserProfile {
    public UserProfile userProfile1;
    public UserProfile userProfile2;
    public HashMap<DateTime, Double> weights1 = new HashMap();
    public HashMap<DateTime, Double> weights2 = new HashMap();

    @Before
    public void before(){
        weights1.put(DateTime.now(), 75);
        weights2.put(DateTime.now(), 80);
        userProfile1 = new UserProfile("Alan", 42, false,
                175.0, weights1, true, true);
        userProfile2 = new UserProfile("Bobia", 42, true,
                175.0, weights2, false, false);
    }

    @Test
    public void canGetUserDetails(){

    }

    @Test
    public void canGetUserPreferences(){

    }

    @Test
    public void canChangeUserPreferences(){

    }
}
