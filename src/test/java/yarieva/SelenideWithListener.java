package yarieva;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yarieva.steps.WebSteps;

public class SelenideWithListener {

    private static final String REPOSITORY = "Kamokk/hw6";


    private final WebSteps steps = new WebSteps();

    @Owner("yarieva")
    @Feature("GitHub")
    @Story("Issues")
    @DisplayName("Selenide with Listener Test")
    @Link(name = "GitHub", url = "https://github.com")

    @Test
    public void testSelenideWithListenerSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldSeeIssue();
    }


}