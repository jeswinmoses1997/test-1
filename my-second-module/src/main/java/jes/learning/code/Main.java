package jes.learning.code;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Logger logger = LogManager.getLogger("myFirstLog");
    public static void main(String[] args) {
        logger.info("Hello and welcome!");
        logger.info("Addition of Two Value = " + MathUtility.add(4,5));
        logger.error("Usage of third party dependency = " + StringUtils.reverse("jeswin"));

//        logger.info("This is a simple message at INFO level. " +
//                "It will be hidden.");
//        logger.error("This is a simple message at ERROR level. " +
//                "This is the minimum visible level.", e);
        }
    }
