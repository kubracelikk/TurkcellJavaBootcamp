package org.example;

public class UserManager {
    public UserManager() {
    }

    public void save(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı kayıt edildi ");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı silindi");
    }

    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı güncellendi");
    }
}


