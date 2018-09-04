package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) throws SolutionNotImplementedException {
		String result="";
		if (number != null) {
			if (number.intValue() % 3 == 0 && number.intValue() % 5 == 0) {
				result = "FizzBuzz";
			} else if (number.intValue() % 3 == 0) {
				result = "Fizz";
			} else if (number.intValue() % 5 == 0) {
				result = "Buzz";
			}			
		}
		return result;

	}

}
