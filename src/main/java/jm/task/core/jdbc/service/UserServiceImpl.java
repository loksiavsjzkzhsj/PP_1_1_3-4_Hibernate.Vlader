package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class UserServiceImpl extends Util implements UserService {
    UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDao.createUsersTable();

    }

    public void dropUsersTable() {
        userDao.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();

    }
}
