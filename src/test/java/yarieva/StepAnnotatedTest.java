package yarieva;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yarieva.steps.WebSteps;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "Kamokk/hw6";


    private final WebSteps steps = new WebSteps();

    @Owner("yarieva")
    @Feature("GitHub")
    @Story("Issues")
    @DisplayName("Annotation Test")
    @Link(name = "GitHub", url = "https://github.com")

    @Test
    public void testAnnotatedSteps() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldSeeIssue();
        steps.attachmentScreenshot();
    }


}