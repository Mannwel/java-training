package basics;

public class Weather {
	public static void main(String[] args) {
		
		// This program will give suggestions of what to wear based on weather temperature and sun condition.
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's a pleasent day. Wear shorts and T-shirt.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler today. Consider wearing a long sleeved shirt.");
			System.out.println("Also, wear a hat to block the sun.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. Make sure to wear warmer clothes.");
		}
		else {
			System.out.println("It looks like a cold day. Bring a sweater with you.");
		}
		
		System.out.println("The program is ending...");
	}

}
