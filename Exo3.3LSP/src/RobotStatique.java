import java.util.ArrayList;
import java.util.List;

public class RobotStatique {

	public int direction;
	public int positionx;
	public int positiony;
	private List<Robot> list;
	RobotStatique(int direction, int positionx, int positiony){
		list = new ArrayList<Robot>();
		this.direction = direction;
		this.positionx = positionx;
		this.positiony = positiony;
		
	}
}
