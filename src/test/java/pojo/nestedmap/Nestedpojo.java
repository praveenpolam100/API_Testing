package pojo.nestedmap;

public class Nestedpojo {
	
	private int id;
	private String name;
	private double price;
	private String category;
	
	private SkillsMap skills;

	
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

	public SkillsMap getSkills() {
		return skills;
	}

	public void setSkills(SkillsMap skills) {
		this.skills = skills;
	}
	
	

	

}
