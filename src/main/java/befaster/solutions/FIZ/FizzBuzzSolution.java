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
    	if(isFakeDeluxe(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("fake deluxe"):sb.append(" fake deluxe");    		
    	}
    	if(sb.length()==0)
    	{
    		sb.append(number.toString());
    	}
    	return sb.toString();
        
    }
    
    private boolean isOldDeluxe(Integer number)
    {
	 return number.toString().matches("(\\d)\\1+")&& isEven(number);
    }
    
    private boolean isOldFakeDeluxe(Integer number)
    {
	return number.toString().matches("(\\d)\\1+")&& !isEven(number);
    }
    
    private boolean isDeluxe(Integer number)
    {
    	if((number%3==0&&number.toString().indexOf("3")!=-1)
    			||(number%5==0&&number.toString().indexOf("5")!=-1)
    			&& isEven(number)){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    private boolean isFakeDeluxe(Integer number)
    {
    	if((number%3==0&&number.toString().indexOf("3")!=-1)
    			||(number%5==0&&number.toString().indexOf("5")!=-1)
    			&& !isEven(number)){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    
    
    
    private boolean isEven(Integer number){
    	if(number%2==0){
    		return true;
    	}else{
    		return false;
    	}
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
