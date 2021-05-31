package params;

import org.testng.annotations.DataProvider;

public class LoginParams {

    @DataProvider(name="correctLogin")
    public Object[][] getCorrectLogin() {
        return new Object[][] {
                {"Pedro", "Pedro"}
        };
    }

    @DataProvider(name="incorrectLogin")
    public Object[][] getInCorrectLogin() {
        return new Object[][] {
                {"PedroX", "PedroX"}
        };
    }

    @DataProvider(name="emptyPasswordLogin")
    public Object[][] getEmptyPasswordLogin() {
        return new Object[][] {
                {"Pedro", ""}
        };
    }
}
