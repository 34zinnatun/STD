
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
 private Long studentId;
 private String name;
 @OneToMany(mappedBy="student")
 Set<Course> courses;
 
 public void addCourse(Course course)
 {
	 if(courses == null)
	 {
		 courses = new HashSet<Course>();
	 }
	 courses.add(course);
 }
}
