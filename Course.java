
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {
	private Long studentId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = false)
	private Student student;
}
