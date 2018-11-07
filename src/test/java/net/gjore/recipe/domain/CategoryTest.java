package net.gjore.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gjorgi.hristovski on 07-Nov-18 in 13:37
 * Created in net.gjore.recipe.domain for recipe
 */
public class CategoryTest {

    Category category;

    @Before
    public void  setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}