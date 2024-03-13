package com.subrutin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subrutin.config.AppConfig;
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

//		ApplicationContext appCtx = new ClassPathXmlApplicationContext("application-context.xml");
//		ApplicationContext appCtx = new FileSystemXmlApplicationContext("D:\\Latihan Framework\\Spring Boot\\Spring Siap Kerja\\2application-context\\src\\main\\resources\\application-context.xml");
//		Menggunakan Metadata berbasis java pada spring framework, menggunakan AppConfig sebagai konfigurasinya tidak lagi menggunakan application-context.xml
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
		BookService bs =  (BookService) appCtx.getBean("bookService");
		BookDetailDTO dto = bs.findBookDetailById(2L);
		System.out.println("Book Detail : " + dto);
	}
}
