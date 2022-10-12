import business.CategotyManager;
import business.CourseManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;


public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};

        Category category = new Category(1,"Programlama");
        //Category category1 = new Category(2,"Programlama");
        CategotyManager categotyManager = new CategotyManager(new HibernateCategoryDao(),loggers);
        categotyManager.add(category);
        //categotyManager.add(category1);

        Course course = new Course(1,"Java",199);
        Course course1 = new Course(2,"SQL",150);
        //Course course2 = new Course(3,"JavaScript",-1);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);

        courseManager.add(course);
        courseManager.add(course1);
        //courseManager.add(course2);






    }
}