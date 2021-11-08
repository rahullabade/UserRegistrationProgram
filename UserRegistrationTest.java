package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenAnyEmail_WhenValidOrNonValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("sdf-100@gmail.com");
        Assert.assertTrue(userTest);
    }
}