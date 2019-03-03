package entity;

public class Employee {
	private String name;
	private Integer age;
	private Integer gender;
    private double salary;
	private String dept;

	public Employee(String name, Integer age, double salary, String dept, Integer gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
	}

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
