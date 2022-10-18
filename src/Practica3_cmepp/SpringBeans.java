package Practica3_cmepp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Practica3_cmepp.core.core.driven_ports.BookRepository;
import Practica3_cmepp.core.core.driver_ports.BookService;
import Practica3_cmepp.core.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
	 @Bean
     BookService bookService(final BookRepository bookRepository) {
         return new BookServiceImpl(bookRepository);
	 }
}
