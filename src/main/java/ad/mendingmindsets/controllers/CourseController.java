package ad.mendingmindsets.controllers;


import ad.mendingmindsets.entities.Course;
import ad.mendingmindsets.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/api/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
