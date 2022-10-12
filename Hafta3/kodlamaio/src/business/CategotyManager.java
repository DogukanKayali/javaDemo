package business;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CategotyManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategotyManager(CategoryDao categoryDao, Logger[] logger) {
        this.categoryDao = categoryDao;
        this.loggers = logger;
    }

    List<Category> categories = new ArrayList<>();

    public void add(Category category) throws Exception {
        for (Category category1 : categories) {

            if (category1.getName().equals(category.getName())) {
                throw new Exception("Aynı isimde başka bir kategori oluşturulamaz.");
            }
        }
        categories.add(category);
        categoryDao.add(category);

        for (Logger logger: loggers){
            logger.log(category.getName());
        }
    }
}
