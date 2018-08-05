package service;

import java.util.List;
import domain.*;

public interface BookService {
	public void createBook(BookBean bean);
	public void modifyBook(BookBean bean);
	public void removeBook(BookBean bean);
	public List<BookBean> searchBookList();
	public List<BookBean> searchByRent(String rent);
	public List<BookBean> searchByTitle(String title);
	public List<BookBean> searchByAuthor(String author);
	public String countByBook();
}
