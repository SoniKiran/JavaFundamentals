package practices;

public class Serching {

	public static void main(String[] args) {
		int Array[] = { 5, 10, 15, 20, 25, 30, 35, 40, 20 };

		int i;
		int item = 10;
		boolean isFound = false;
		for (i = 0; i < Array.length; i++) {
			if (Array[i] == item) {

				System.out.println("Item " + item + " found at " + (i + 1));
				isFound = true;
			}

		}
		if (isFound == false) {
			System.out.println("Item " + item + " not found");
		}

	}

}
