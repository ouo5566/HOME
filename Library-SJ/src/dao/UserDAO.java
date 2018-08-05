package dao;

import java.util.List;
import domain.*;

public interface UserDAO {
	public void insertUser(UserBean bean);
	public void updateUser(UserBean bean);
	public void deleteUser(UserBean bean);
	public List<UserBean> selectUserList();
	public List<UserBean> selectByName(String name);
	public UserBean selectById(String id);
	public String countByUser();
	public void login(UserBean user);
}
