package model;
//certified parameters
public class Certified {
	private String rank;
	private String name;
	
	
	
	public Certified(String rank, String name) {
		super();
		this.rank = rank;
		this.name = name;
	}
	
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
