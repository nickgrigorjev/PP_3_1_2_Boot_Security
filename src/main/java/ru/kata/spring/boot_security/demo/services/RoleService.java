package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;
import java.util.Set;


public interface RoleService {

    Role findRoleById(Integer id);
    List<Role> getAllRoles();
    List<Role> getUniqueRoles();
    void addRole(Role role);

}
