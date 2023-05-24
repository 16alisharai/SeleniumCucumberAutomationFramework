package stepDefinitions;
import java.io.File;
import java.io.IOException;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
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

    //will get executed when scenario fails at any step
    @AfterTest
    public void TakeScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = testSetup.baseclass.WebDriverManager();
        if(scenario.isFailed()){

            File path = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent= FileUtils.readFileToByteArray(path);
            scenario.attach("fileContent", "image/png" , "image");
        }

    }

}
