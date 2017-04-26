package aaBreakDown;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 25/04/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features=".",format="html:target/Cucumber.Reports",tags="@AA")
public class RunTest {
}
