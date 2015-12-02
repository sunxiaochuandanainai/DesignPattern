package adapter;


/**
 * 将Stone转化为Person
 * @author barcelona
 *
 */
public class StoneAdapter implements Human{

	private Stone stone;
	
	
	public StoneAdapter(Stone stone) {
		// TODO Auto-generated constructor stub
		this.stone = stone;
	}


	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return stone.getWeight();
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return stone.getType();
	}


	@Override
	public void think() {
		// TODO Auto-generated method stub
		stone.describe();
	}


	@Override
	public void feel() {
		// TODO Auto-generated method stub
		stone.smash();
	}
	
	
	
	
}
