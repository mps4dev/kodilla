package pl.mps.kodilla.module1;

import static pl.mps.kodilla.module1.UserValidator.LIMIT_AGE;
import static pl.mps.kodilla.module1.UserValidator.LIMIT_HEIGHT;

class UserValidator {

    public static final double LIMIT_AGE = 30.0;
    public static final double LIMIT_HEIGHT= 160.0;

    public boolean validateName(String name) {
        return name != null;
    }
    public boolean validateAge(double age) {
        return age > LIMIT_AGE;
    }
    public boolean validateHeight(double height) {
        return height > LIMIT_HEIGHT;
    }
}

public class Application1 {

    private static final String OLDER_AND_HIGHER = "User is older than %f and higher than %f cm.";
    private static final String NOT_OLDER_OR_NOT_HIGHER = "User is not older than %f and no higher than %f cm.";
    private static final String INVALID_USERNAME = "User name should not be empty.";

    public static void main(String[] args) {

        String name = "UserName";
        double age = 27;
        double height = 184.5;

        UserValidator validator = new UserValidator();

        if (validator.validateName(name)) {
            if (validator.validateAge(age) && validator.validateHeight(height)) {
                System.out.println(String.format(OLDER_AND_HIGHER, LIMIT_AGE, LIMIT_HEIGHT));
            } else {
                System.out.println(String.format(NOT_OLDER_OR_NOT_HIGHER, LIMIT_AGE, LIMIT_HEIGHT));
            }
        } else {
            System.out.println(INVALID_USERNAME);
        }
    }
}