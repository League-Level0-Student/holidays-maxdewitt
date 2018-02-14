import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
public static void main(String[] args) {
	
	Robot rob = new Robot();
	rob.setSpeed(1000);
	rob.setWindowImage("hearts.jpg");
	rob.miniaturize();
	rob.moveTo(500,500);
	rob.setAngle(36);
	rob.penDown();
	rob.move(300);
	for (int i = 0; i < 180; i++) {
		rob.setSpeed(1000);
		rob.move(2);
		rob.turn(-1);
		
	}
	rob.setAngle(-36);
	for (int a = 0; a < 180; a++) {
		rob.setSpeed(1000);
		rob.move(2);
		rob.turn(-1);
		
	}
	rob.setAngle(-36);
	rob.move(-300);
			
}
}
