import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator casio = new Calculator("Casio", "G-shock");

    @Test
    public void testSum(){
        Assert.assertEquals(casio.sum(10,5), 15);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(casio.multiply(10,5), 50);
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(casio.divide(10,5), 2);
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(casio.subtract(10,5), 5);
    }

    @Test
    public void testPow(){
        Assert.assertEquals(casio.pow(10), 100);
    }

    // cover get/set; get model name, set model name
}
