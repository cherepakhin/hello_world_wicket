package org.wicketTutorial.commons.bootstrap.layout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BootstrapBasePageTest {
    @Test
    public void getPackageName() {
        BootstrapBasePage page = new BootstrapBasePage();
        assertEquals("", page.getPackageName());
    }
}