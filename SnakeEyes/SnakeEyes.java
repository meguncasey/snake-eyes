

public class SnakeEyes
{
    
 public static void main (String[] args) {
    int roll; 
    roll = 0; 
    System.out.println("welcome to my snake eyes program");

 while (true) {
 int dice1 =(int)(Math.random()*6+1); 
 int dice2 =(int)(Math.random()*6+1);
 int result = dice1 + dice2;
 roll++; 
 System.out.println("Roll:"+ roll); 
 System.out.println("Dice one = " + dice1);
 System.out.println("Dice Two = " + dice2); 
 System.out.println("total: "+ result); 
 if (dice1 == 1 && dice2 == 1) {
     System.out.println("SNAKE EYES!");
     System.exit(0);
    }
}
}
    
}


   



   