package immutable;

import java.util.ArrayList;

public final class CustomImmutable {

	private final int id;
	private final String name;
	private final Course course;
	private final ArrayList<Integer>favourateno;
	
	
	
	public CustomImmutable(int id, String name, Course course,
			ArrayList<Integer> favourateno) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.favourateno = favourateno;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Course getCourse() {
		// To prevent change in course object instead of returning course obj create similar object by using course object and return it,
		return new Course(course.getCourseid(),course.getSubject1(),course.getSubject2(),course.getSubject3());
	}
	public ArrayList<Integer> getFavourateno() {
		return new ArrayList(favourateno); //defencive copy to achieve immutablity
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result
				+ ((favourateno == null) ? 0 : favourateno.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomImmutable other = (CustomImmutable) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (favourateno == null) {
			if (other.favourateno != null)
				return false;
		} else if (!favourateno.equals(other.favourateno))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomImmutable [id=" + id + ", name=" + name + ", course="
				+ course + ", favourateno=" + favourateno + "]";
	}
	
	
	
	
	

}
