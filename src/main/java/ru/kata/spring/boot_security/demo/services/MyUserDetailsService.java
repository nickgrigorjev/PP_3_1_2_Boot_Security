package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.repositories.UsersRepository;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    public MyUserDetailsService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> users = usersRepository.findByUsername(username);

        if (users.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        } else {
            return users.get();
        }
    }

}
