package com.mycompany.myselion.sample;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.mobile.ios.UIAStaticText;
import com.paypal.selion.platform.mobile.ios.UIANavigationBar;
import com.paypal.selion.platform.mobile.ios.UIATableView;

public class NativeAppTestPage extends BasicPageImpl {

    private UIATableView sampleUIATableView;
    private UIANavigationBar sampleUIANavigationBar;
    private UIAStaticText sampleUIAStaticText;

    private static String CLASS_NAME = "NativeAppTestPage";
    private static String PAGE_DOMAIN = "sample";


    /**
     * Creates a new NativeAppTestPage object
     */
    public NativeAppTestPage() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new NativeAppTestPage object
     
     * @param siteLocale
     *        The Country locale for the site you are accessing
     */
    public NativeAppTestPage(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public NativeAppTestPage getPage() {
        return this;
    }


    /**
     * Used to get sampleUIATableView in the page NativeAppTestPage
     *
     * @return sampleUIATableView
     */
    public UIATableView getSampleUIATableView() {
        UIATableView element = this.sampleUIATableView;
        if(element == null) {
            this.sampleUIATableView = new UIATableView(getObjectMap().get("sampleUIATableView"));
        }
        return this.sampleUIATableView;
    }


    /**
     * Used to get sampleUIANavigationBar in the page NativeAppTestPage
     *
     * @return sampleUIANavigationBar
     */
    public UIANavigationBar getSampleUIANavigationBar() {
        UIANavigationBar element = this.sampleUIANavigationBar;
        if(element == null) {
            this.sampleUIANavigationBar = new UIANavigationBar(getObjectMap().get("sampleUIANavigationBar"));
        }
        return this.sampleUIANavigationBar;
    }


    /**
     * Used to get sampleUIAStaticText in the page NativeAppTestPage
     *
     * @return sampleUIAStaticText
     */
    public UIAStaticText getSampleUIAStaticText() {
        UIAStaticText element = this.sampleUIAStaticText;
        if(element == null) {
            this.sampleUIAStaticText = new UIAStaticText(getObjectMap().get("sampleUIAStaticText"));
        }
        return this.sampleUIAStaticText;
    }

}
