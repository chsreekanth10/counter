package railways.senbot.cucumber.tests.webapp;

import org.junit.runner.RunWith;

import com.gfk.senbot.framework.cucumber.CucumberTestBase;
import com.gfk.senbot.framework.cucumber.ParameterizedCucumber;

import cucumber.api.junit.Cucumber;

@RunWith(ParameterizedCucumber.class)
@Cucumber.Options(
        format = {"pretty", "html:target/test-results" + WebAppChapter2Test.PATH}, 
        monochrome = true, 
        features = "features" + WebAppChapter2Test.PATH, 
        glue = {"com.gfk.senbot", "railways"}, 
        tags = {"~@ignore", "~@to-implement"}, 
        strict = true)
public class WebAppChapter2Test extends CucumberTestBase {
	
	public static final String PATH = "/WebApp/Chapter2";

}
