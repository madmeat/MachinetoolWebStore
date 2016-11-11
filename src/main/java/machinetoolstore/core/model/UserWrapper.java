/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

/**
 *
 * @author main
 */
public class UserWrapper {
    private final String ssoId;
    private final String password;
    private final String type;

    public UserWrapper(String ssoId, String password, String type) {
        this.ssoId = ssoId;
        this.password = password;
        this.type = type;
    }

    public String getSsoId() {
        return ssoId;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }
    
    
}
