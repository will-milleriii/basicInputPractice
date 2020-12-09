import org.junit.Assert;
import org.junit.Test;

public class TestMultiply {


    @Test
    public void testMultiply(){
        int a = 5;
        int b = 10;
        int multExp = 50;
        int multAct = a * b;

        Assert.assertEquals(multExp, multAct);
    }

}
