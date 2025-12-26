@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        if (ingredientRepository.findByNameIgnoreCase(ingredient.getName()).isPresent()) {
            throw new BadRequestException("Ingredient already exists");
        }
        ingredient.setActive(true);
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient getIngredientById(Long id) {
        return ingredientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ingredient not found"));
    }

    @Override
    public Ingredient updateIngredient(Long id, Ingredient updated) {
        Ingredient existing = getIngredientById(id);

        if (!existing.getName().equalsIgnoreCase(updated.getName()) &&
            ingredientRepository.findByNameIgnoreCase(updated.getName()).isPresent()) {
            throw new BadRequestException("Duplicate ingredient name");
        }

        existing.setName(updated.getName());
        existing.setCostPerUnit(updated.getCostPerUnit());
        existing.setUnit(updated.getUnit());

        return ingredientRepository.save(existing);
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public void deactivateIngredient(Long id) {
        Ingredient ing = getIngredientById(id);
        ing.setActive(false);
        ingredientRepository.save(ing);
    }
}
