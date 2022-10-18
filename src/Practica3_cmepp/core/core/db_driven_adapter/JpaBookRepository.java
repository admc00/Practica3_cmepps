package Practica3_cmepp.core.core.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Practica3_cmepp.core.core.db_driven_adapter.domain.BookEntity;
import Practica3_cmepp.core.core.db_driven_adapter.jparepository.HAAJpaRepository;
import Practica3_cmepp.core.core.driven_ports.BookRepository;
import Practica3_cmepp.core.domain.Book;
import Practica3_cmepp.core.domain.BookDoesNotExistException;


@Component
public class JpaBookRepository implements BookRepository {

	@Autowired // enlaza repositorio y servicio
	private HAAJpaRepository haaJpaRepository;

	@Override
	public Book findById(Long id) {
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		return bookEntity.toBook();
	}

}
