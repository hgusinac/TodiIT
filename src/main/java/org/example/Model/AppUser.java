package org.example.Model;

import java.util.Objects;

public class AppUser {
    private String userName;
    private String password;
    private AppRole role;


    public AppUser(String username, String password, AppRole role) {
        this.userName = username;
        this.password = password;
        this.role = role;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role ==null || role.equals("")){
            throw new RuntimeException("Role cant be null och empty");
        }
        this.role = role;
    }



    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        if (username ==null || username.equals("")){
            throw new RuntimeException("Username cant be null och empty");
        }

        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password ==null || password.equals("")){
            throw new RuntimeException("Password cant be null och empty");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + userName + '\'' +
                ", role=" + getRole().getValue() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(userName, appUser.userName) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role);
    }
}
