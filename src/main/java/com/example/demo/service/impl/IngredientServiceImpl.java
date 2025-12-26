@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repo;

    public IngredientServiceImpl(IngredientRepository repo) {
        this.repo = repo;
    }

    public Ingredient createIngredient(Ingredient ing) {
        if (repo.findByNameIgnoreCase(ing.getName()).isPresent())
            throw new BadRequestException("Duplicate");
        ing.setActive(true);
        return repo.save(ing);
    }

    public Ingredient getIngredientById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found"));
    }

    public Ingredient updateIngredient(Long id, Ingredient ing) {
        Ingredient e = getIngredientById(id);
        e.setCostPerUnit(ing.getCostPerUnit());
        return repo.save(e);
    }

    public List<Ingredient> getAllIngredients() {
        return repo.findAll();
    }

    public void deactivateIngredient(Long id) {
        Ingredient e = getIngredientById(id);
        e.setActive(false);
        repo.save(e);
    }
}
