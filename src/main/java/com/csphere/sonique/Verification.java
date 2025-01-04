package com.csphere.sonique;

import static com.csphere.sonique.users.Customer.PASSWORD_ENCODER;

public class Verification {

    public boolean verifypassword(String entered_password, String entered_Username ) {
        // TODO():
        /*
            check if username in db
            if yes:
                 extract encrypted password of the entered username
                 check if the encrypted password == entered_password
                 if yes:
                    user has been verified; return true
                 else:
                    false
            else:
                false
        */
        PASSWORD_ENCODER.encode(entered_password);
        // if extracted password == entered password:
        return true;
    }


}
