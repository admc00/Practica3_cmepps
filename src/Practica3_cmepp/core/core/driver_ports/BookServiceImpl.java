package Practica3_cmepp.core.core.driver_ports;

import Practica3_cmepp.core.core.driven_ports.BookRepository;
import Practica3_cmepp.core.domain.Book;

public class BookServiceImpl implements BookService{
	
	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
	}
	@Override
	public Book getBook(Long id) {
		
		return bookRepository.findById(id);
	}

}
