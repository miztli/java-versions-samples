package java14;

import org.junit.Assert;
import org.junit.Test;

public class SwitchExpressionTest
{
    @Test
    public void shouldTestUseSwitchWithArrowFunctions() {
        final int option = 2;
        final String message =
        switch (option) {
            case 1 -> "This is option 1";
            case 2 -> "This is option 2";
            case 3 -> "This is option 3";
            default -> "This is default message";
        };

        Assert.assertEquals("This is option 2", message);
    }

    @Test
    public void shouldTestUseSwitchWithYieldKeyword() {
        final int option = 2;
        final String message =
        switch (option) {
            case 1: yield "This is option 1";
            case 2:
                System.out.printf("Do sth else before returning value");
                yield "This is option 2";
            case 3: yield "This is option 3";
            default: yield "This is default message";
        };

        Assert.assertEquals("This is option 2", message);
    }
}
