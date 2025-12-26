public interface IngredientService {
    Ingredient createIngredient(Ingredient ingredient);
    Ingredient getIngredientById(Long id);
    Ingredient updateIngredient(Long id, Ingredient ingredient);
    List<Ingredient> getAllIngredients();
    void deactivateIngredient(Long id);
}
