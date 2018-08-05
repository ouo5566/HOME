package dao;

import java.util.List;

import domain.RentBean;

public class RentDAOImpl implements RentDAO{
	private static RentDAO instance = new RentDAOImpl();
	public static RentDAO getInstance() {return instance;}
	private RentDAOImpl() {}
	@Override
	public void insertRent(RentBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOverdueMoney(String money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RentBean> selectRentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentBean> selectById(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentBean> selectByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectOverdue(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void returnBook(String bookNum) {
		// TODO Auto-generated method stub
		
	}
}
