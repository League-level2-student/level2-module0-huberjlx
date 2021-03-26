package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	
	//2. create an array of 5 robots.
	Robot [] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setY(500);
			robots[i].setSpeed(10);
			robots[i].setX(100 + (100 * i));
			robots[i].setAngle(0);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean notAtTop = true;
	while (notAtTop == true);
		Random rand = new Random();
		for (int j = 0; j < robots.length; j++) {
			int num = rand.nextInt();
			robots[j].move(num);
			if (robots[j].getY() <= 0) {
				notAtTop = false;
			}
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
		
		
	}

