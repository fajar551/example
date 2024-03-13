package com.subrutin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;

/**
 * Hello world!
 *
 */

/**
 * 
 * @author fajarhabibzaelani
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        Author author = new Author();
//		ClassPathXmlApplicationContext adalah salah satu application context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
//		Author author = (Author) appContext.getBean("author");
//		System.out.println("author id: "  + author.getId());
//		System.out.println("author name: " + author.getName());

		// Sukses Mengimplementasikan inversion of control dan dependency injection
		BookService bookService = (BookService) appContext.getBean("bookService");
//		BookDetailDTO bookDetailDTO = bookService.findBookDetailById(1L); //ini id 1
		BookDetailDTO bookDetailDTO = bookService.findBookDetailById(2L); //ini id 2
		System.out.println("Book Detail = " + bookDetailDTO);
		
//		Ditampung ke object Author
//		Author author = (Author) appContext.getBean("author");
//		System.out.println("Author : " + author);
	}
}
