package org.wicketTutorial.commons.bootstrap.layout;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.jupiter.api.Test;

public class BootstrapBasePageTest {
    @Test
    public void testRenderPage() {
        WicketTester tester = new WicketTester();
        tester.startPage(BootstrapBasePage.class);
        tester.assertRenderedPage(BootstrapBasePage.class);
    }
}