package com.npci.crudproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Entity annotation defines that a class can be mapped to table
@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int useId;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "salary")
	private float salary;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int useId, String name, int age, float salary) {
		super();
		this.useId = useId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getUseId() {
		return useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [useId=" + useId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
