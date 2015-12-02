package adapter;

public class Rock implements Stone{

	
	private int weight;
	private String type;
	
	
	
	public Rock(int weight, String type) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.type = type;
	}
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("This is " + type + " it weights " + weight + " kilos.");
	}

	@Override
	public void smash() {
		// TODO Auto-generated method stub
		System.out.println("This stone has been smashed away");
	}

}
