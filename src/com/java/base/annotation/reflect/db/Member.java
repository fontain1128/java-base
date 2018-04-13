package com.java.base.annotation.reflect.db;


/**
 * Member��
 * @author Administrator
 *
 */
@DbTable(name="MEMBER")
public class Member {
	//��Ӧ��id
	@SQLInteger(name="id",constraint=@Constraints(primaryKey=true,allowNull=false,unique=true))
	private int id;
	//��Ӧ��name
	@SQLString(name="name",value=3,constraint=@Constraints(allowNull=true))
	private String name;
	//��Ӧ��age
	@SQLInteger(name="age",value=3,constraint=@Constraints(allowNull=true))
	private int age;
	//��Ӧ��description
	@SQLString(name="description",value=100,constraint=@Constraints(allowNull=true))
	private String description;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
