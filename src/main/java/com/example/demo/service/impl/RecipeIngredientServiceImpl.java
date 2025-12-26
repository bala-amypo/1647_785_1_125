@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    private final RecipeIngredientRepository recipeIngredientRepository;
    private final IngredientRepository ingredientRepository;
    private final MenuItemRepository menuItemRepository;

    public RecipeIngredientServiceImpl(RecipeIngredientRepository recipeIngredientRepository,
                                       IngredientRepository ingredientRepository,
                                       MenuItemRepository menuItemRepository) {
        this.recipeIngredientRepository = recipeIngredientRepository;
        this.ingredientRepository = ingredientRepository;
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public RecipeIngredient addIngredientToMenuItem(RecipeIngredient ri) {
        if (ri.getQuantity() <= 0) {
            throw new BadRequestException("Quantity must be positive");
        }

        ingredientRepository.findById(ri.getIngredient().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Ingredient not found"));

        menuItemRepository.findById(ri.getMenuItem().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Menu item not found"));

        return recipeIngredientRepository.save(ri);
    }

    @Override
    public Double getTotalQuantityOfIngredient(Long ingredientId) {
        return recipeIngredientRepository.getTotalQuantityByIngredientId(ingredientId);
    }
}
