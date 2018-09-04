package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) throws SolutionNotImplementedException{
       
    	if(number != null) {
    		
    		for(int i=0;i<100;i++) {
    			if(i % number.intValue() == 0) {
    				System.out.println("Fizz");
    			}else {
    				System.out.println(i);
    			}
    				
        		
        	}
        	
    	}
    	
    }

}
