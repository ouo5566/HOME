package service;

import java.util.List;
import dao.*;
import domain.*;

public class BookServiceImpl implements BookService{
	private static BookService instance = new BookServiceImpl();
	public static BookService getInstance() {return instance;}
	private BookServiceImpl() {}
	
	@Override
	public void createBook(BookBean bean) {
		BookDAOImpl.getInstance().insertBook(bean);
	}

	@Override
	public void modifyBook(BookBean bean) {
		BookDAOImpl.getInstance().updateBook(bean);
	}

	@Override
	public void removeBook(BookBean bean) {
		BookDAOImpl.getInstance().deleteBook(bean);
	}

	@Override
	public List<BookBean> searchBookList() {
		return BookDAOImpl.getInstance().selectBookList();
	}

	@Override
	public List<BookBean> searchByRent(String rent) {
		return BookDAOImpl.getInstance().selectByRent(rent);
	}

	@Override
	public List<BookBean> searchByTitle(String title) {
		return BookDAOImpl.getInstance().selectByTitle(title);
	}

	@Override
	public List<BookBean> searchByAuthor(String author) {
		return BookDAOImpl.getInstance().selectByAuthor(author);
	}

	@Override
	public String countByBook() {
		return BookDAOImpl.getInstance().countByBook();
	}

}
