@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repo;

    public MenuItemServiceImpl(MenuItemRepository r,
                               RecipeIngredientRepository rr,
                               CategoryRepository cr) {
        this.repo = r;
    }

    public MenuItem createMenuItem(MenuItem item) {
        if (item.getSellingPrice().signum() <= 0)
            throw new BadRequestException("Invalid price");
        return repo.save(item);
    }

    public List<MenuItem> getAllMenuItems() {
        return repo.findAll();
    }

    public void deactivateMenuItem(Long id) {
        MenuItem m = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found"));
        m.setActive(false);
        repo.save(m);
    }
}
