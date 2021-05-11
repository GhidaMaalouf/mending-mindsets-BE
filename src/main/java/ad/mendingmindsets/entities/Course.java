package ad.mendingmindsets.entities;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
import java.util.Date;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int courseId;
    private String title;
    private String topic;
    private int duration;
    private String location;
    private Date date;
    @OneToMany(mappedBy = "course")
    private List<Users> userList;

    private String imagePath;

    public Course(){};

    public String getImagePath() {
        return imagePath;
    }

    public List<Users> getUserList() {
        return userList;
    }

    public void setUserList(List<Users> userList) {
        this.userList = userList;
    }

    public UUID getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
