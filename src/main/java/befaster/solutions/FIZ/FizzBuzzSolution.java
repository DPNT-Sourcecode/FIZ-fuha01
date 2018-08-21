package befaster.solutions.FIZ;
public class FizzBuzzSolution {

   
    
public String fizzBuzz(Integer number) {
    	
    	StringBuilder sb = new StringBuilder();
    	FizzBuzz implementation = new FizzBuzzImplementation();
    	
    	if(implementation.isFizz(number))
    	{
    		sb.append("fizz");
    	}
    	if(implementation.isBuzz(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("buzz"):sb.append(" buzz");    		
    	}
    	if(implementation.isDeluxe(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("deluxe"):sb.append(" deluxe");    		
    	}
    	if(implementation.isFakeDeluxe(number))
    	{    	    
    		sb= (sb.length()==0)?sb.append("fake deluxe"):sb.append(" fake deluxe");    		
    	}
    	if(sb.length()==0)
    	{
    		sb.append(number.toString());
    	}
    	return sb.toString();
        
    }
    

    
   }
