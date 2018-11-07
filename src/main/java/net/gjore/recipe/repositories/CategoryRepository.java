package net.gjore.recipe.repositories;

import net.gjore.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by gjorgi.hristovski on 05-Nov-18 in 12:58
 * Created in net.gjore.recipe.repositories for recipe
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
