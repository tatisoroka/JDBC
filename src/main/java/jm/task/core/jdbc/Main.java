package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Semen","Petrov",(byte) 18);
        userService.saveUser("Ivan","Ivanov",(byte) 40);
        userService.saveUser("Dima","Dimov",(byte) 21);
        userService.saveUser("Olga","Fokina",(byte) 36);

        System.out.println(userService.getAllUsers());
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
