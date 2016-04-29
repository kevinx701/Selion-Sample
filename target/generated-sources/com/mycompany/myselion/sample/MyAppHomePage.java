package com.mycompany.myselion.sample;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.Label;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.html.Button;

public class MyAppHomePage extends BasicPageImpl {

    private TextField lastNameTextField;
    private Label emailLabel;
    private TextField firstNameTextField;
    private Button submitButton;
    private Button retryAgainButton;
    private Label firstNameLabel;
    private Label lastNameLabel;
    private TextField emailTextField;


     /**
     * SeLion GUI Html Object Standard
     *    
     * The naming conventions followed in SeLion for html elements are as follows,
     *
     * <alias>{corresponding class name of the html element in SeLion} where - <alias> will be the object name with its 
     * first letter in lowercase.
     * 
     * <alias>Button                For Button html element.
     * <alias>CheckBox              For Check Box html element.
     * <alias>DatePicker            For Date Picker html element.
     * <alias>Form                  For Form html element.
     * <alias>Image                 For Image html element.
     * <alias>Label                 For Label html element.
     * <alias>Link                  For Link html element.
     * <alias>RadioButton           For Radio Button html element.
     * <alias>List                  For Select List html element.
     * <alias>Table                 For Table html element.
     * <alias>TextField             For Text Field html element.
     * <alias>Container             For Container html element.
     * 
     */
     

    private static String CLASS_NAME = "MyAppHomePage";
    private static String PAGE_DOMAIN = "sample";


    /**
     * Creates a new MyAppHomePage object
     */
    public MyAppHomePage() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new MyAppHomePage object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public MyAppHomePage(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public MyAppHomePage getPage() {
        return this;
    }



    /**
     * Used to get lastNameTextField in the page MyAppHomePage
     *
     * @return lastNameTextField
     */
    public TextField getLastNameTextField() {
        TextField element = this.lastNameTextField;
        if(element == null) {
            this.lastNameTextField = new TextField(getObjectMap().get("lastNameTextField"), "lastNameTextField",
                    this);
        }
        return this.lastNameTextField;
    }

    /**
     * Used to set the value of lastNameTextField in the page MyAppHomePage.
     */
    public void setLastNameTextFieldValue(String lastName) {
        getLastNameTextField().type(lastName);
    }
    
    /**
     * Used to get the value of lastNameTextField in the page MyAppHomePage.
     *
     * @return text in lastNameTextField
     */
    public String getLastNameTextFieldValue() {
        return getLastNameTextField().getText();
    }



    /**
     * Used to get emailLabel in the page MyAppHomePage
     *
     * @return emailLabel
     */
    public Label getEmailLabel() {
        Label element = this.emailLabel;
        if(element == null) {
            this.emailLabel = new Label(getObjectMap().get("emailLabel"), "emailLabel",
                    this);
        }
        return this.emailLabel;
    }

    /**
     * Used to check for the specific text available in the control emailLabel
     */
    public boolean isTextPresentForEmailLabel(String pattern) {
        return getEmailLabel().isTextPresent(pattern);
    }



    /**
     * Used to get firstNameTextField in the page MyAppHomePage
     *
     * @return firstNameTextField
     */
    public TextField getFirstNameTextField() {
        TextField element = this.firstNameTextField;
        if(element == null) {
            this.firstNameTextField = new TextField(getObjectMap().get("firstNameTextField"), "firstNameTextField",
                    this);
        }
        return this.firstNameTextField;
    }

    /**
     * Used to set the value of firstNameTextField in the page MyAppHomePage.
     */
    public void setFirstNameTextFieldValue(String firstName) {
        getFirstNameTextField().type(firstName);
    }
    
    /**
     * Used to get the value of firstNameTextField in the page MyAppHomePage.
     *
     * @return text in firstNameTextField
     */
    public String getFirstNameTextFieldValue() {
        return getFirstNameTextField().getText();
    }



    /**
     * Used to get submitButton in the page MyAppHomePage
     *
     * @return submitButton
     */
    public Button getSubmitButton() {
        Button element = this.submitButton;
        if(element == null) {
            this.submitButton = new Button(getObjectMap().get("submitButton"), "submitButton",
                    this);
        }
        return this.submitButton;
    }

    /**
     * Used to click submitButton in the page MyAppHomePage and check that resulting page contains expected item.
     */
    public void clickSubmitButton(Object... expected) {
        getSubmitButton().click(expected);
    }

    /**
     * Used to click submitButton in the page MyAppHomePage
     */
    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    /**
     * Used to get the value of submitButton in the page MyAppHomePage.
     *
     * @return text in submitButton
     */
    public String getSubmitButtonValue() {
        return getSubmitButton().getText();
    }



    /**
     * Used to get retryAgainButton in the page MyAppHomePage
     *
     * @return retryAgainButton
     */
    public Button getRetryAgainButton() {
        Button element = this.retryAgainButton;
        if(element == null) {
            this.retryAgainButton = new Button(getObjectMap().get("retryAgainButton"), "retryAgainButton",
                    this);
        }
        return this.retryAgainButton;
    }

    /**
     * Used to click retryAgainButton in the page MyAppHomePage and check that resulting page contains expected item.
     */
    public void clickRetryAgainButton(Object... expected) {
        getRetryAgainButton().click(expected);
    }

    /**
     * Used to click retryAgainButton in the page MyAppHomePage
     */
    public void clickRetryAgainButton() {
        getRetryAgainButton().click();
    }

    /**
     * Used to get the value of retryAgainButton in the page MyAppHomePage.
     *
     * @return text in retryAgainButton
     */
    public String getRetryAgainButtonValue() {
        return getRetryAgainButton().getText();
    }



    /**
     * Used to get firstNameLabel in the page MyAppHomePage
     *
     * @return firstNameLabel
     */
    public Label getFirstNameLabel() {
        Label element = this.firstNameLabel;
        if(element == null) {
            this.firstNameLabel = new Label(getObjectMap().get("firstNameLabel"), "firstNameLabel",
                    this);
        }
        return this.firstNameLabel;
    }

    /**
     * Used to check for the specific text available in the control firstNameLabel
     */
    public boolean isTextPresentForFirstNameLabel(String pattern) {
        return getFirstNameLabel().isTextPresent(pattern);
    }



    /**
     * Used to get lastNameLabel in the page MyAppHomePage
     *
     * @return lastNameLabel
     */
    public Label getLastNameLabel() {
        Label element = this.lastNameLabel;
        if(element == null) {
            this.lastNameLabel = new Label(getObjectMap().get("lastNameLabel"), "lastNameLabel",
                    this);
        }
        return this.lastNameLabel;
    }

    /**
     * Used to check for the specific text available in the control lastNameLabel
     */
    public boolean isTextPresentForLastNameLabel(String pattern) {
        return getLastNameLabel().isTextPresent(pattern);
    }



    /**
     * Used to get emailTextField in the page MyAppHomePage
     *
     * @return emailTextField
     */
    public TextField getEmailTextField() {
        TextField element = this.emailTextField;
        if(element == null) {
            this.emailTextField = new TextField(getObjectMap().get("emailTextField"), "emailTextField",
                    this);
        }
        return this.emailTextField;
    }

    /**
     * Used to set the value of emailTextField in the page MyAppHomePage.
     */
    public void setEmailTextFieldValue(String email) {
        getEmailTextField().type(email);
    }
    
    /**
     * Used to get the value of emailTextField in the page MyAppHomePage.
     *
     * @return text in emailTextField
     */
    public String getEmailTextFieldValue() {
        return getEmailTextField().getText();
    }

}

