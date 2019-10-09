package arrays;


import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5]; 
		int[] robotsY = {500,500,500,500,500};
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("Robot"+i);
		//4. make each robot start at the bottom of the screen, side by side, facing up
			Robot x = robots[i];
			x.setAngle(0);
			x.setY(500);
			x.setX(i*150+75);
			x.setSpeed(3);
			robots[i] = x;
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 75.
		while(robotsY[0] > 0) {
		
		for(int i = 0; i < robots.length; i++) {
			int x = new Random().nextInt(75);
			robots[i].move(x);
			robotsY[i] = robots[i].getY();
			Arrays.sort(robotsY);
			
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		}
	//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "race finished");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
