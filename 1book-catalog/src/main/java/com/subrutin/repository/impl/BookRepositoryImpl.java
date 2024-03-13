package com.subrutin.repository.impl;

import java.util.Map;

import com.subrutin.domain.Book;
import com.subrutin.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {
	
	private Map<Long, Book> bookMap;

//	di comment, karena tidak hardcode lagi melainkan di app-context.xml
//	public BookRepositoryImpl() {
//		super();
//		bookMap = new HashMap<Long, Book>();
//		Author author = new Author();
//		author.setId(1L);
//		author.setName("Pramoedya Ananta Toer");
//		author.setBirthDate(-16401L);
//		
//		Book book1 = new Book(author);
//		book1.setId(1L);
//		book1.setTitle("Bumi Manusia");
//		book1.setDescription("Bumi manusia adalah salah satu Novel karya Pramoedya Ananta Toer");
//		
//		
//		bookMap.put(book1.getId(), book1);
//	}
	

	@Override
	public Book findBookById(Long id) {
		// value nya ditampung kedalam sebuah objek book
		Book book =  bookMap.get(id);
		return book;
	}

	public Map<Long, Book> getBookMap() {
		return bookMap;
	}

	public void setBookMap(Map<Long, Book> bookMap) {
		this.bookMap = bookMap;
	}

}
