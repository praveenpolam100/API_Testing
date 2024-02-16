package pojo.nestedmap;

import java.util.List;

public class Nestedpojo2 {
	
	private int id;
	private String name;
	private double price;
	private String category;
	
	private List <SkillsMap> skills;

	
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<SkillsMap> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillsMap> skills) {
		this.skills = skills;
	}

	
	

	

}
