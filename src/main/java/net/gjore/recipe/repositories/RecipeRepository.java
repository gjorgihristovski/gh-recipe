package net.gjore.recipe.repositories;

import net.gjore.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gjorgi.hristovski on 05-Nov-18 in 12:57
 * Created in net.gjore.recipe.repositories for recipe
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
