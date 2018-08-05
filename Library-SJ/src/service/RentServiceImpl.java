package service;

import java.util.List;

import dao.RentDAOImpl;
import domain.RentBean;

public class RentServiceImpl implements RentService{
	private static RentService instance = new RentServiceImpl();
	public static RentService getInstance() {return instance;}
	private RentServiceImpl() {}
	@Override
	public void createRent(RentBean bean) {
		RentDAOImpl.getInstance().insertRent(bean);
	}

	@Override
	public void removeOverdueMoney(String money) {
		RentDAOImpl.getInstance().deleteOverdueMoney(money);
	}

	@Override
	public List<RentBean> searchRentList() {
		return RentDAOImpl.getInstance().selectRentList();
	}

	@Override
	public List<RentBean> searchById(String userid) {
		return RentDAOImpl.getInstance().selectById(userid);
	}

	@Override
	public List<RentBean> searchByTitle(String title) {
		return RentDAOImpl.getInstance().selectByTitle(title);
	}

	@Override
	public String searchOverdue(String userid) {
		return RentDAOImpl.getInstance().selectOverdue(userid);
	}

	@Override
	public void returnBook(String bookNum) {
		RentDAOImpl.getInstance().returnBook(bookNum);
	}

}
