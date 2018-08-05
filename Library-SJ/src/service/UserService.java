package service;

import java.util.List;
import domain.*;

public interface UserService {
	public void createUser(UserBean bean);
	public void modifyUser(UserBean bean);
	public void removeUser(UserBean bean);
	public List<UserBean> searchUserList();
	public List<UserBean> searchByName(String name);
	public UserBean searchById(String id);
	public String countByUser();
	public void login(UserBean user);
}
