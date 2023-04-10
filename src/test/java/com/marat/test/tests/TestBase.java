package com.marat.test.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.marat.test.config.WebDriverProvider;
import com.marat.test.helpers.Attach;
import com.marat.test.pages.BookingAHotelPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public BookingAHotelPage bookingAHotelPage = new BookingAHotelPage();

    @BeforeAll
    static void setting() {
        WebDriverProvider.setConfig();
    }

    @BeforeEach
    public void beforeEach() {
        open("");
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
//        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
