package net.gjore.recipe.services;

import net.gjore.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 05-Nov-18 in 15:52
 * Created in net.gjore.recipe.services for recipe
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
