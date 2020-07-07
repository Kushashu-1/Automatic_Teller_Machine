package p;

import java.util.regex.*;

public class Basic_function {

    public boolean isValidamount(String amount) {
        boolean temp = false;
        try {
            long money = Long.parseLong(amount);
            if ((money % 100 == 0) && money > 0) {
                temp = true;
            }
        } catch (Exception e) {
            return false;
        }

        return temp;
    }

    public boolean isValidmob(String mob) {
        if (!(mob.length() == 10))
            return false;
        try {
            long money = Long.parseLong(mob);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isValidNewPin(String new_pin, String confirm_pin) {
        try {
            if (Integer.parseInt(new_pin) == Integer.parseInt(confirm_pin)) {
                if (new_pin.length() == 5) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isValidFirstName(String name) {
        return Pattern.matches("[a-zA-z]+", name);
    }

    public boolean isValidLastName(String name) {
        return Pattern.matches("[a-zA-z ]*", name);
    }

    public boolean isValidAddress(String add) {
        return Pattern.matches("[a-zA-Z0-9 ]+", add);
    }

    public String isValidAccountDetails(String mob_no, String address, String first_name, String last_name,
            String amount) {
        String result = "";

        if (!(isValidmob(mob_no)))
            result = result + "Mobile number is Not Valid \n";
        if (!isValidAddress(address))
            result = result + "Address is Not Appropriate \n";
        if (!isValidFirstName(first_name))
            result = result + "First Name is Not Valid \n";
        if (!isValidLastName(first_name))
            result = result + "Last Name is Not Valid \n";
        if (!isValidamount(amount))
            result = result + "Amount  is Not valid";

        return result;
    }
}