package immutable;

// this class is not final as 
/**
 * @author amit
 *
 */
public class Course {

	private  int courseid;
	private String subject1;
	private String subject2;
	private String subject3;
	
	public Course(int courseid, String subject1, String subject2,
			String subject3) {
		super();
		this.courseid = courseid;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
   // here we have both setter and getter 	

	public int getCourseid() {
		return courseid;
	}



	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}



	public String getSubject1() {
		return subject1;
	}



	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}



	public String getSubject2() {
		return subject2;
	}



	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}



	public String getSubject3() {
		return subject3;
	}



	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseid;
		result = prime * result
				+ ((subject1 == null) ? 0 : subject1.hashCode());
		result = prime * result
				+ ((subject2 == null) ? 0 : subject2.hashCode());
		result = prime * result
				+ ((subject3 == null) ? 0 : subject3.hashCode());
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
		Course other = (Course) obj;
		if (courseid != other.courseid)
			return false;
		if (subject1 == null) {
			if (other.subject1 != null)
				return false;
		} else if (!subject1.equals(other.subject1))
			return false;
		if (subject2 == null) {
			if (other.subject2 != null)
				return false;
		} else if (!subject2.equals(other.subject2))
			return false;
		if (subject3 == null) {
			if (other.subject3 != null)
				return false;
		} else if (!subject3.equals(other.subject3))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", subject1=" + subject1
				+ ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}
}
