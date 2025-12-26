@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repo;

    public CategoryServiceImpl(CategoryRepository repo) {
        this.repo = repo;
    }

    public Category createCategory(Category c) {
        if (repo.findByNameIgnoreCase(c.getName()).isPresent())
            throw new BadRequestException("Duplicate");
        return repo.save(c);
    }
}
