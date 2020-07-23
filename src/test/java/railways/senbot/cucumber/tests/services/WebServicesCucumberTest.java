package railways.senbot.cucumber.tests.services;

import org.junit.runner.RunWith;

import com.gfk.senbot.framework.cucumber.CucumberTestBase;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty", "html:target/test-results" + WebServicesCucumberTest.PATH}, 
        monochrome = true, 
        features = "features" + WebServicesCucumberTest.PATH, 
        glue = {"com.gfk.senbot", "railways"}, 
        tags = {"~@ignore","~@to-implement"}, 
        strict = true)
public class WebServicesCucumberTest extends CucumberTestBase {
	
	public static final String PATH = "/services";

}
