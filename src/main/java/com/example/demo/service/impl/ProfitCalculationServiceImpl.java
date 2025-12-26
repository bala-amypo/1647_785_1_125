@Service
public class ProfitCalculationServiceImpl implements ProfitCalculationService {

    private final MenuItemRepository menuRepo;
    private final RecipeIngredientRepository recipeRepo;
    private final ProfitCalculationRecordRepository recordRepo;

    public ProfitCalculationServiceImpl(MenuItemRepository m,
                                        RecipeIngredientRepository r,
                                        IngredientRepository i,
                                        ProfitCalculationRecordRepository p) {
        menuRepo = m;
        recipeRepo = r;
        recordRepo = p;
    }

    public ProfitCalculationRecord calculateProfit(Long id) {
        if (recipeRepo.findByMenuItemId(id).isEmpty())
            throw new BadRequestException("No ingredients");
        return new ProfitCalculationRecord();
    }

    public ProfitCalculationRecord getCalculationById(Long id) {
        return recordRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found"));
    }
}
