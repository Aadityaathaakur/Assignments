class RollDice {
     
        private int die;   
        String result;
        public RollDice(int die) {
                this.die=die;
//System.out.println(this.die);
            roll();  
        }
        
        public void roll() {
                if(die==6)
		{
            	die = (int)(Math.random()*6) + 1;
		result =Integer.toString(die);}
		else if(die==4){
	die = (int)(Math.random()*4) + 1;
	result =Integer.toString(die);}
	else if(die==2){
	die = (int)(Math.random()*2) + 1;
	result =Integer.toString(die);}
	else

	result ="invalid input";
           
        }
                 
        public String getDie() {
             
           return result;
        }
        
     }  

public class ass1 {
     
        public static void main(String[] args) {
           
           RollDice dice;         
              
     		System.out.println("enter type of die");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int type= sc.nextInt();
                 dice = new RollDice(type); 
          
           System.out.println("result after roll is  "+ dice.getDie());
           
        }
        
     }
