//import static org.junit.Assert.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    Turtles turtles = new Turtles();

    @Test
    public void smallFactorialTest(){
        int expected = 120;
        int actual = turtles.factorial(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void largeFactorialTest(){
        int expected = 3628800;
        int actual = turtles.factorial(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneFactorialTest(){
        int expected = 1;
        int actual = turtles.factorial(1);
        Assert.assertEquals(expected, actual);
    }

}