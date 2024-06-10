package com.alltosoftware.validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordConstraint, String> {

    @Override
    public void initialize(PasswordConstraint password) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false;
        }
        // Implement your custom password validation logic here
        // For example:
        return password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()].*");
    }
}
