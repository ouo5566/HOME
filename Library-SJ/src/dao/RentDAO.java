package dao;

import java.util.List;
import domain.*;

public interface RentDAO {
	public void insertRent(RentBean bean);
	public void deleteOverdueMoney(String money);
	public List<RentBean> selectRentList();
	public List<RentBean> selectById(String userid);
	public List<RentBean> selectByTitle(String title);
	public String selectOverdue(String userid);
	public void returnBook(String bookNum);
}
