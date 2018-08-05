package dao;

import java.util.List;
import domain.*;

public class BookDAOImpl implements BookDAO{
	private static BookDAO instance = new BookDAOImpl();
	public static BookDAO getInstance() {return instance;}
	private BookDAOImpl() {}
	@Override
	public void insertBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookBean> selectBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> selectByRent(String rent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> selectByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> selectByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countByBook() {
		// TODO Auto-generated method stub
		return null;
	}
}
