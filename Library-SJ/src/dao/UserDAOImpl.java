package dao;

import java.util.List;
import domain.UserBean;

public class UserDAOImpl implements UserDAO{
	private static UserDAO instance = new UserDAOImpl();
	public static UserDAO getInstance() {return instance;}
	private UserDAOImpl() {}
	@Override
	public void insertUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserBean> selectUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBean> selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(UserBean user) {
		// TODO Auto-generated method stub
		
	}
}
