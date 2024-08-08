package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    private static final UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    public static void main(String[] args) {
        userDaoJDBC.dropUsersTable();
        userDaoJDBC.createUsersTable();

        userDaoJDBC.saveUser("John", "Black", (byte) 25);
        userDaoJDBC.saveUser("Milly", "Brown", (byte) 19);
        userDaoJDBC.saveUser("Sally", "Cooper", (byte) 33);
        userDaoJDBC.saveUser("Samantha", "Jobs", (byte) 44);

        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.dropUsersTable();
    }
}
