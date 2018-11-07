package net.gjore.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import net.gjore.recipe.domain.Category;
import net.gjore.recipe.domain.UnitOfMeasure;
import net.gjore.recipe.repositories.CategoryRepository;
import net.gjore.recipe.repositories.UnitOfMeasureRepository;
import net.gjore.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by gjorgi.hristovski on 01-Nov-18 in 12:06
 * Created in net.gjore.recipe.controllers for recipe
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting the index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
