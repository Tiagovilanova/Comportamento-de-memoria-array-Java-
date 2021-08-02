package entities;

public class Exfix {

	private Integer id;
	private String name;
	private Double salary;

	public Exfix(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Exfix() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary+=salary*percentage/100;
	}

	public String toString() {
		return id+", " + name + ", " + String.format("%.2f", salary);
	}
}
