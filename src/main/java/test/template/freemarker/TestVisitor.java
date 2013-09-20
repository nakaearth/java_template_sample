package test.template.freemarker;

public class TestVisitor {
	private String name;
	private Integer age;
	private String address;
	
	public TestVisitor(String name, Integer age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
