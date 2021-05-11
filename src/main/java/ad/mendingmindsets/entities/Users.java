package ad.mendingmindsets.entities;


import javax.persistence.*;
import javax.persistence.Table;
import java.util.UUID;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_course")
    private Course course;

    public Users(UUID id, String firstName, String lastName, String email,Course course) {
       this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course=course;
    }

    public Users(){};

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
