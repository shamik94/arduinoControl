import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass {
	Robot robot = new Robot();

	public static void main(String[] args) throws AWTException {
		new RobotClass();
	}

	public RobotClass() throws AWTException {
		robot.setAutoWaitForIdle(true);
		type(32); //32 corresponds to the Space-bar Key

	}

	private void type(int i) {
		robot.delay(50);
		robot.keyPress(i);
		robot.keyRelease(i);
	}

}
