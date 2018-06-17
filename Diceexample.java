package TestExamples;



class RollDice {
    
    private int die;   
    int result;
    public RollDice(int die) {
            this.die=die;
//System.out.println(this.die);
        roll();  
    }
    
    public void roll() {
            if(die==6)
	{
            	result = (int)(Math.random()*6) + 1;
	//result =Integer.toString(die);
        	}

	else if(die==4){
		result = (int)(Math.random()*4) + 1;
//result =Integer.toString(die);
}

else if(die==2){
	result = (int)(Math.random()*2) + 1;

}
       
    }
    


	public String getDie(int n){
		
		if(n==2){
			switch(result){
			case 1: return "HEADS";
			case 2:return "TAILS";
			}
			
		}
		else if(n==6){
			switch(result){
			case 1: return "ONE";
			case 2:return "TWO";
			case 3:return "THREE";
			case 4:return "FOUR";
			case 5: return "FIVE";
			case 6: return "SIX";
			}}
			else if(n==4){
				switch(result){
				case 1: return "ONE";
				case 2:return "TWO";
				case 3:return "THREE";
				case 4:return "FOUR";
				
				}
		}
			else
				return "Invalid Input";
		return null;
	}
	
}
             
   
public class Diceexample {

	
	public static void main(String[] args) {

		RollDice dice;         
        
 		System.out.println("enter type of die");
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int type= sc.nextInt();
             dice = new RollDice(type); 
      
       System.out.println("result after roll is = "+ dice.getDie(type));	
		
		
		
		
	}

}
