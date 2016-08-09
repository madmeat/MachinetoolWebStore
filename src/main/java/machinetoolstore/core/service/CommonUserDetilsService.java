/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.service;

import java.util.ArrayList;
import java.util.List;
import machinetoolstore.core.model.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author main
 */

@Service("userDetailService")
public class CommonUserDetilsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Autowired
//    UserService userService;
//    
//    @Override
//    public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
//        UserWrapper currentUser = userService.findBySsoId(ssoId);
//        if(currentUser == null) {
//            throw new UsernameNotFoundException("User with sso " + ssoId + " not found!");
//        }
//        return new User(currentUser.getSsoId(), currentUser.getPassword(), true, true
//                ,true, true, getAuthorities(currentUser));
//    }
//    
//    private List<GrantedAuthority> getAuthorities(final UserWrapper currentUser) {
//        List<GrantedAuthority> authoritiesList = new ArrayList<GrantedAuthority>() {
//            {
//                this.add(new SimpleGrantedAuthority("ROLE_" + currentUser.getType().toUpperCase()));
//            }
//        };
//        return authoritiesList;
//    }
    
}
