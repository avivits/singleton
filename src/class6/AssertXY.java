package class6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertXY {

    int x=1;
    int y = 2;

    @Test
    public void assertXY() {
        Assert.assertNotEquals(x,y);
    }

}
