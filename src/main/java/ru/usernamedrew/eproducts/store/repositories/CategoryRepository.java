package ru.usernamedrew.eproducts.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usernamedrew.eproducts.store.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
