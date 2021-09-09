package br.com.curitiba.fincar.api.security;

import br.com.curitiba.fincar.domain.UserAccess;
import br.com.curitiba.fincar.domain.UserAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserAccessRepository userAccessRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        UserAccess userAccess = userAccessRepository.findByLogin(username);
        if(userAccess ==null) {
            throw new UsernameNotFoundException("user not found");
        }
        return userAccess;
        }
}
