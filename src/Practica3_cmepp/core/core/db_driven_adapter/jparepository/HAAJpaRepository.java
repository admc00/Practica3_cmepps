package Practica3_cmepp.core.core.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import Practica3_cmepp.core.core.db_driven_adapter.domain.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long>  {

}
