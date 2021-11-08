package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.email("rahullabade123@gmail.com");
        Assert.assertTrue(userTest);
    }
}
