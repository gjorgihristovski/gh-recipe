package net.gjore.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by gjorgi.hristovski on 05-Nov-18 in 08:40
 * Created in net.gjore.recipe.domain for recipe
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
