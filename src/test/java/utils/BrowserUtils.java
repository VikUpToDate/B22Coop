package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BrowserUtils {


    //all methods are static

    // WebElement element = driver.findElement();
    // element.getText();
    // Thank you
    public static String getText(WebElement element){

        return element.getText().trim();

    }


    //clears input filed and enters data into the input field
    public static void sendKeys(WebElement element, String keys){

        element.clear();
        element.sendKeys(keys);

    }


    // reusable method to handle dropdowns
    public static void selectBy(WebElement element, String option, String methodName){

        Select select = new Select(element);

        switch (methodName){

            case "visibleText":
                select.selectByVisibleText(option);
                break;
            case "byValue":
                select.selectByValue(option);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(option));
                break;
            default:
                System.out.println("Please check your method name, the method you chose is not available");
                break;

        }



    }


    // returns list of webElement from select. It retrieves all the options from the dropdown
    public static List<WebElement> getAllSelectOptions(WebElement element){

        Select select = new Select(element);
        return select.getOptions();

    }

    public static void selectOptionFromAllOptions(WebElement element, String option){

        Select select = new Select(element);
        for (WebElement e: select.getOptions()){

            if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
                e.click();
                break;
            }

        }

    }

    public static void selectOptionFromAllOptions(List<WebElement> elementList, String option){

        for (WebElement e: elementList){

            if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
                e.click();
                break;
            }

        }

    }

    public static void click(WebElement element){

        element.click();

    }







}
