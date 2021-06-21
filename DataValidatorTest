package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {


    @org.junit.jupiter.api.Test
    void isValidCPRNotValid() {
        DataValidator validator = new DataValidator();
        String input = "abc";
        Assertions.assertFalse(validator.isValidCPR(input));
    }
    @org.junit.jupiter.api.Test
    void isValidCPRNotValidTooShort() {
        DataValidator validator = new DataValidator();
        String input = "123456-123";
        Assertions.assertFalse(validator.isValidCPR(input));
    }
    @org.junit.jupiter.api.Test
    void isValidCPRValid1() {
        DataValidator validator = new DataValidator();
        String input = "120356-1234";
        Assertions.assertTrue(validator.isValidCPR(input));
    }
    @org.junit.jupiter.api.Test
    void isNotValidCPRInValidDate() {
        DataValidator validator = new DataValidator();
        String input = "991702-1234";
        Assertions.assertFalse(validator.isValidCPR(input));
    }


    @org.junit.jupiter.api.Test
    void isValidFirstNameValid() {
        DataValidator validator = new DataValidator();
        String input = "Hans";
        Assertions.assertTrue(validator.isValidFirstName(input));
    }
    @org.junit.jupiter.api.Test
    void isValidFirstNameNotValid() {
        DataValidator validator = new DataValidator();
        String input = "A";
        Assertions.assertFalse(validator.isValidFirstName(input));
    }
    @org.junit.jupiter.api.Test
    void isValidFirstNameNotValid1() {
        DataValidator validator = new DataValidator();
        String input = "123";
        Assertions.assertFalse(validator.isValidFirstName(input));
    }


    @org.junit.jupiter.api.Test
    void isValidLastNameValid() {
        DataValidator validator = new DataValidator();
        String input = "Hansen";
        Assertions.assertTrue(validator.isValidLastName(input));
    }
    @org.junit.jupiter.api.Test
    void isValidLastNameNotValid() {
        DataValidator validator = new DataValidator();
        String input = "A";
        Assertions.assertFalse(validator.isValidLastName(input));
    }
    @org.junit.jupiter.api.Test
    void isValidLastNameNotValid1() {
        DataValidator validator = new DataValidator();
        String input = "123";
        Assertions.assertFalse(validator.isValidLastName(input));
    }


    @org.junit.jupiter.api.Test
    void isValidPhoneValid() {
        DataValidator validator = new DataValidator();
        String input = "+4512345678";
        Assertions.assertTrue(validator.isValidPhone(input));
    }
}
