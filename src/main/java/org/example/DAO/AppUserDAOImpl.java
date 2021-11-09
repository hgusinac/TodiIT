package org.example.DAO;

import org.example.Model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDAOImpl implements AppUserDAO{

    private List<AppUser> appUserList = new ArrayList<>();


    @Override
    public AppUser persist(AppUser appUser) {
        boolean isSaved = this.appUserList.add(appUser);
        if (isSaved) {
            return appUser;
        }
        return null;
    }

    @Override
    public AppUser findByUsername(String userName) {
        for (AppUser aU : this.appUserList){
            if (aU.getUsername().equals(userName)){
                return aU;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return this.appUserList;
    }

    @Override
    public void remove(String userName) {
        AppUser appUser = findByUsername(userName);
        this.appUserList.remove(appUser);

    }
}
