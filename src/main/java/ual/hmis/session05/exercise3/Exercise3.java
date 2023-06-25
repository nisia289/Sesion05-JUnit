package ual.hmis.session05.exercise3;

public class Exercise3 {

    public String correctPassword(String password) {
        int length = password.length();
        if (length < 5) {
            return "password too short";
        } else if (length >= 5 && length <= 8) {
            return "********";
        } else if (length >= 12 && length <= 40) {
            return "************";
        } else if (length > 40) {
            return "password too long";
        }

      else return "";
    }
}
