package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	if(number%3==0)
    	{
    		sb.append("fizz");
    	}
    	if(number%5==0)
    	{    	    
    		sb= (sb.length()==0)?sb.append("buzz"):sb.append(" buzz");    		
    	}
    	if(sb.length()==0)
    	{
    		sb.append(number.toString());
    	}
    	return sb.toString();
        
    }

}
