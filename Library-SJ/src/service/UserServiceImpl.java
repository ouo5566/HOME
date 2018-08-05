package service;

import java.util.List;

import dao.UserDAOImpl;
import domain.UserBean;

public class UserServiceImpl implements UserService{
	private static UserService instance = new UserServiceImpl();
	public static UserService getInstance() {return instance;}
	private UserServiceImpl() {}
	@Override
	public void createUser(UserBean bean) {
		UserDAOImpl.getInstance().insertUser(bean);
	}

	@Override
	public void modifyUser(UserBean bean) {
		UserDAOImpl.getInstance().updateUser(bean);
	}

	@Override
	public void removeUser(UserBean bean) {
		UserDAOImpl.getInstance().deleteUser(bean);
	}

	@Override
	public List<UserBean> searchUserList() {
		return UserDAOImpl.getInstance().selectUserList();
	}

	@Override
	public List<UserBean> searchByName(String name) {
		return UserDAOImpl.getInstance().selectByName(name);
	}

	@Override
	public UserBean searchById(String id) {
		return UserDAOImpl.getInstance().selectById(id);
	}

	@Override
	public String countByUser() {
		return UserDAOImpl.getInstance().countByUser();
	}

	@Override
	public void login(UserBean user) {
		UserDAOImpl.getInstance().login(user);
	}

}
