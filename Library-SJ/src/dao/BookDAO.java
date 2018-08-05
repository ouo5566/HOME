package dao;

import java.util.List;
import domain.*;

public interface BookDAO {
	public void insertBook(BookBean bean);
	public void updateBook(BookBean bean);
	public void deleteBook(BookBean bean);
	public List<BookBean> selectBookList();
	public List<BookBean> selectByRent(String rent);
	public List<BookBean> selectByTitle(String title);
	public List<BookBean> selectByAuthor(String author);
	public String countByBook();
}
