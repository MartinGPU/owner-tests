package com.marat.test.tests;

import org.junit.jupiter.api.Test;

public class WebTest extends TestBase {

    @Test
    public void searchHotel() {
        bookingAHotelPage.hotels();
        bookingAHotelPage.checkResults();
    }
}
