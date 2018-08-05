package service;

import java.util.List;
import domain.*;

public interface RentService {
	public void createRent(RentBean bean);
	public void removeOverdueMoney(String money);
	public List<RentBean> searchRentList();
	public List<RentBean> searchById(String userid);
	public List<RentBean> searchByTitle(String title);
	public String searchOverdue(String userid);
	public void returnBook(String bookNum);
}
