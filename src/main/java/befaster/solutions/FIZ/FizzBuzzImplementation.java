package befaster.solutions.FIZ;

public class FizzBuzzImplementation implements FizzBuzz {

	@Override
	public boolean isFizz(Integer number) {
		if(number%3==0||number.toString().indexOf("3")!=-1)
    	{
		   return true;
    	}
		else{
	
		   return false;
    	}
	}

	@Override
	public boolean isBuzz(Integer number) {
		if(number%5==0||number.toString().indexOf("5")!=-1)
    	{
		   return true;
    	}
		else{
	
		   return false;
    	}
	}

	@Override
	public boolean isDeluxe(Integer number) {
		if((number%3==0&&number.toString().indexOf("3")!=-1)
    			||(number%5==0&&number.toString().indexOf("5")!=-1)
    			&& isEven(number)){
    		return true;
    	}else{
    		return false;
    	}
	}

	@Override
	public boolean isFakeDeluxe(Integer number) {
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

	


}
