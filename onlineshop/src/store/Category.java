package store;

public class Category {
	private String Subject;
	private String Name;
	
	public Category(){
		
	}
	
	public Category(String Subject, String Name) {
		this.Subject = Subject;
		this.Name = Name;
	}
	
	public String getSubject() {
		return Subject;
	}
	
	public void setSubject(String Subject) {
		this.Subject = Subject;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}

}


