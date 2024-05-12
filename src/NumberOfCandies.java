import java.util.ArrayList;
import java.util.List;

/**
 * @author meganathan
 * 
 *         below the code for find the candies in the children sums
 */
public class NumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> booleanList = new ArrayList<Boolean>();

		for (int i = 0; i < candies.length; i++) {
			int candy = candies[i] + extraCandies;
			for (int j = 0; j < candies.length - 1; j++) {
				if (candy >= candies[j + 1]) {
					booleanList.add(true);
				} else {
					booleanList.add(false);
					break;
				}

			}
		}
		return booleanList;
	}

	public static void main(String[] args) {

		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		NumberOfCandies numberOfCandies = new NumberOfCandies();
		List<Boolean> res = numberOfCandies.kidsWithCandies(candies, extraCandies);

		System.out.println(res);
	}
}
