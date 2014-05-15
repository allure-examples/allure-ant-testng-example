package ru.yandex.qatools.allure;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MyClassTest {

    @Test()
    public void testEmailGenerator() {

        final MyClass obj = new MyClass();
        final String email = obj.generate();

        assertNotNull(email);
        assertEquals(email, "feedback@yoursite.com");

    }
    
} 
