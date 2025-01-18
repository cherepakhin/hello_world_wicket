package org.wicketTutorial.commons.bootstrap;

import org.apache.wicket.markup.html.WebPage;
import org.wicketTutorial.helloworld.HomePage;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 * @see org.wicketTutorial.helloworld.Start#main(String[])
 */
public class WicketApplication extends BootstrapApp {
    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
    }

}
