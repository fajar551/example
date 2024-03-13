package com.subrutin.service;

import com.subrutin.domain.Book;
import com.subrutin.dto.BookDetailDTO;

public interface BookService {
	// Memiliki dependency terhadap kelas Book;
	//	private Book book;
	public BookDetailDTO findBookDetailById(Long bookId);

}
