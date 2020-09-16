package model;
//non-certified parameters
public class NonCertified {

	private String rank ;
	private String name;
	
	public NonCertified(String rank, String name) {
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
