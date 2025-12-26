public interface MenuItemService {
    MenuItem createMenuItem(MenuItem item);
    List<MenuItem> getAllMenuItems();
    void deactivateMenuItem(Long id);
}
