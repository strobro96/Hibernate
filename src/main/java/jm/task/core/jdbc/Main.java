package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Стив", "Джобс", (byte) 56);
        userService.saveUser("Илон", "Маск", (byte) 51);
        userService.saveUser("Марк", "Цукерберг", (byte) 38);
        userService.saveUser("Павел", "Дуров", (byte) 38);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

