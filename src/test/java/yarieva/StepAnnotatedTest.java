package yarieva;

import yarieva.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "Kamokk/hw6";
//   @Owner("Yarieva")
 //   @Feature("Github")
  //  @Story("Issues")
  //  @DisplayName("Annotation Test")
   // @Link(name = "GitHub", url = "https://github.com/Kamokk/hw6")


    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
       // steps.openIssueTab();
        steps.shouldSeeIssue();
    }
}