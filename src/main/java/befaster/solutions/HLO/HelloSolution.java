package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;



public class HelloSolution {
	
	public static final String HELLO_WORLD ="Hello, World!";
	
    public String helloOne(String friendName) {
        return HELLO_WORLD;
    }
    
    public String hello(String friendName) {
    	if(friendName!=null){
    		return HELLO_WORLD.replace("World", friendName);
    	}else{
        return HELLO_WORLD;
    	}
    }
}
