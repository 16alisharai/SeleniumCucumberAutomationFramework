package stepDefinitions;
import java.io.IOException;
import io.cucumber.java.After;
import utils.TestSetUp;

public class Hooks {

    TestSetUp testSetup;

    public Hooks(TestSetUp testSetup) {

        this.testSetup= testSetup;


    }


    @After

    public void AfterScenario() throws IOException {

        testSetup.baseclass.WebDriverManager().quit();

    }

}
