package ru.yandex.qatools.allure;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class MyClassTest {

    @Test()
    @Step("Test step")
    public void testEmailGenerator() {

        final MyClass obj = new MyClass();
        final String email = obj.generate();

        assertNotNull(email);
        assertEquals(email, "feedback@yoursite.com");

    }
    
} 
