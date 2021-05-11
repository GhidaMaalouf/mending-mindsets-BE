package ad.mendingmindsets.services;


import ad.mendingmindsets.entities.Course;
import ad.mendingmindsets.repositories.CourseRepository;
import ad.mendingmindsets.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }


}
