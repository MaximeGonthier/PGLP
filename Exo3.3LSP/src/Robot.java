

import java.util.ArrayList;
import java.util.List;

public class Robot extends RobotStatique {

	Robot(int direction, int positionx, int positiony ) {
		super(direction,positionx,positiony);
	}
	
	
	
	public void avancer() {
		this.positionx = positionx + 1;
	}
	
	
}
