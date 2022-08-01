import java.util.Random;
public class Snake_ladder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to snake and ladder game...");
		
		int n = 0;
        Random ran = new Random();
        n = ran.nextInt(7);
        System.out.println("The player got the position " + n);

	}

}
