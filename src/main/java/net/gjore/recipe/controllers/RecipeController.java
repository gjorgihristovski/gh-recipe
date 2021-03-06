package net.gjore.recipe.controllers;

import net.gjore.recipe.commands.RecipeCommand;
import net.gjore.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gjorgi.hristovski on 09-Nov-18 in 09:57
 * Created in net.gjore.recipe.controllers for gh-recipe
 */
@Controller
public class RecipeController {

    private final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable Long id, Model model){

        model.addAttribute("recipe", recipeService.findById(id));

        return "recipe/show";

    }

    @RequestMapping("recipe/new")
    public String newRecipe(Model model){
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @PostMapping(name = "recipe")
    public String saveOrUpdate(@ModelAttribute RecipeCommand command){
        RecipeCommand savedCommand = recipeService.saveRecipeCommand(command);

        return "redirect:/recipe/show/" + savedCommand.getId();
    }
}
