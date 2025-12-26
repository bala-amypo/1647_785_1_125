public interface RecipeIngredientService {
    RecipeIngredient addIngredientToMenuItem(RecipeIngredient ri);
    Double getTotalQuantityOfIngredient(Long id);
}
