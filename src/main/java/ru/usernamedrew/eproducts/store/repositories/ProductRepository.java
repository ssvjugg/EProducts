package ru.usernamedrew.eproducts.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usernamedrew.eproducts.store.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
