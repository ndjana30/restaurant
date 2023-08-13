package com.davy.restaurant.controllers;

import com.davy.restaurant.models.Category;
import com.davy.restaurant.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryServices cs;

    @GetMapping("all")
    public List<Category> getCategories()
    {
        return cs.getAllCategories();
    }
    @PostMapping("add")
    public String addCategory(@RequestBody Category category)  throws IOException, SQLException {

        return cs.AddCategory(category);
    }
}
