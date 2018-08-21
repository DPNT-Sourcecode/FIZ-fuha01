package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

   
    
public String fizzBuzz(Integer number) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	if(isFizz(number))
    	{
    		sb.append("fizz");
    	}
    	if(isBuzz(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("buzz"):sb.append(" buzz");    		
    	}
    	if(isDeluxe(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("deluxe"):sb.append(" deluxe");    		
    	}
    	if(sb.length()==0)
    	{
    		sb.append(number.toString());
    	}
    	return sb.toString();
        
    }
    
    private boolean isDeluxe(Integer number) {
	return number.toString().matches("(\\d)\\1+");
	
}

	private boolean isFizz(Integer number){
    	
    	if(number%3==0||number.toString().indexOf("3")!=-1)
    	{
		   return true;
    	}
		else{
	
		   return false;
    	}
    }
    
    private boolean isBuzz(Integer number){
    	if(number%5==0||number.toString().indexOf("5")!=-1)
    	{
		   return true;
    	}
		else{
	
		   return false;
    	}
    	
    }

}
