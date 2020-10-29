package kz.webtodolist.v1.Controllers;

import kz.webtodolist.v1.Category;
import kz.webtodolist.v1.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/test")
    public String index(Model model) {
        Iterable<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);

        return "index";
    }
}
