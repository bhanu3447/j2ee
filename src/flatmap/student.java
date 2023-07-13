package flatmap;



import java.util.Objects;

public class student
{
 
  private int id;
  private String name;
  private String course;
  
  
@Override
public String toString() 
{
	return "student [id=" + id + ", name=" + name + ", course=" + course + "]";
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public student(int id, String name, String course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	
	
}


@Override
public int hashCode() {
	return Objects.hash(course, id, name);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	student other = (student) obj;
	return Objects.equals(course, other.course) && id == other.id && Objects.equals(name, other.name);
}
}

