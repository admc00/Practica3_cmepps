package Practica3_cmepp.core.core.driven_ports;

import Practica3_cmepp.core.domain.Book;

public interface BookRepository {
		Book findById(Long id);
}
