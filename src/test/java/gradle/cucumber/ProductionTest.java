package gradle.cucumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionTest {

    @Test
    public void doWork() {
        Assert.assertEquals("test", new Production().doWork());
    }
}