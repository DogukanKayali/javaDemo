package business;

import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    List<Course> courses = new ArrayList<>();

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0){
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
        }
        courses.add(course);
        courseDao.add(course);

        for (Logger logger: loggers){
            logger.log(course.getName());
        }
    }
}

