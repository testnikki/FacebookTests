package pages;

public interface CommonPage {
    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";
    String XPATH_TEMPLATE_CONTAINS_CLASS = "//a//span[contains(@class, '%s')]";
    String XPATH_TEMPLATE_NAV_BAR = "//div[@class='right-col pull-right']//a[contains(text(), '%s')]";
    String XPATH_TEMPLATE_TEXT2 = "//div[@class='menu-bg']//a[contains(@href,'%s')]";
    String XPATH_TEMPLATE_TEXT2_CONTAINS = "(//a[contains(text(), '%s')])[2]";

    String XPATH_TEMPLATE_FOOTER_LINKS = "//div[contains(@class,'footer-link')]//div[@class='inner']//a[contains(text(),'%s')]";

}
