package org.example.DAO;

import org.example.App;
import org.example.Model.AppUser;

import java.util.Collection;

public interface AppUserDAO {
    AppUser persist (AppUser appUser);
    AppUser findByUsername(String userName);
    Collection<AppUser> findAll();
    void remove (String userName);
}
