package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenSpecialCharacter_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.specialCharacter("Rahul!05");
        Assert.assertTrue(userTest);
    }
}