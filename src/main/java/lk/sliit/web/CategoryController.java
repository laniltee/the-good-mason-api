package lk.sliit.web;

import lk.sliit.domain.Category;
import lk.sliit.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @PostMapping("/categories")
    public Category addNewCategory(@Valid @RequestBody Category category){
        return categoryRepository.save(category);
    }
}


