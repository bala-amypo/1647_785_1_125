@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    private final RecipeIngredientRepository repo;
    private final IngredientRepository ingRepo;
    private final MenuItemRepository menuRepo;

    public RecipeIngredientServiceImpl(RecipeIngredientRepository r,
                                       IngredientRepository i,
                                       MenuItemRepository m) {
        repo = r; ingRepo = i; menuRepo = m;
    }

    public RecipeIngredient addIngredientToMenuItem(RecipeIngredient ri) {
        if (ri.getQuantity() <= 0)
            throw new BadRequestException("Invalid quantity");
        return repo.save(ri);
    }

    public Double getTotalQuantityOfIngredient(Long id) {
        return repo.getTotalQuantityByIngredientId(id);
    }
}
