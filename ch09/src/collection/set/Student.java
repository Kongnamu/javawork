package collection.set;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	//중복을 제거하기 위한 재정의1
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	//중복을 제거하기 위한 재정의2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(name.equals(student.name))
				return true;
		}
		return false;
	}
	
	

	
}
