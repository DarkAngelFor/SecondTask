package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.saveUser("Эмиль", "Галиев", (byte) 25);
        System.out.println(userDaoJDBC.getAllUsers());
    }
}
