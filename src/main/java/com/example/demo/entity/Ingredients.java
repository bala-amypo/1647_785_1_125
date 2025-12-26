@Service
public class ProfitCalculationServiceImpl implements ProfitCalculationService {

    private final MenuItemRepository menuItemRepository;
    private final RecipeIngredientRepository recipeIngredientRepository;
    private final IngredientRepository ingredientRepository;
    private final ProfitCalculationRecordRepository recordRepository;

    public ProfitCalculationServiceImpl(MenuItemRepository menuItemRepository,
                                        RecipeIngredientRepository recipeIngredientRepository,
                                        IngredientRepository ingredientRepository,
                                        ProfitCalculationRecordRepository recordRepository) {
        this.menuItemRepository = menuItemRepository;
        this.recipeIngredientRepository = recipeIngredientRepository;
        this.ingredientRepository = ingredientRepository;
        this.recordRepository = recordRepository;
    }

    @Override
    public ProfitCalculationRecord calculateProfit(Long menuItemId) {
        MenuItem item = menuItemRepository.findById(menuItemId)
                .orElseThrow(() -> new ResourceNotFoundException("Menu item not found"));

        List<RecipeIngredient> ingredients =
                recipeIngredientRepository.findByMenuItemId(menuItemId);

        if (ingredients.isEmpty()) {
            throw new BadRequestException("No ingredients found");
        }

        return new ProfitCalculationRecord();
    }

    @Override
    public ProfitCalculationRecord getCalculationById(Long id) {
        return recordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found"));
    }
}
