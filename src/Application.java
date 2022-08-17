
public class Application {

public static <Wizard> void main(String[] args) {
		
		Wizard wiz1=new Wizard();
		
		System.out.println(wiz1.toString());
				
		Wizard wiz2=new Wizard("Gandalf");
		
		System.out.println(wiz2.toString());
		
				
		wiz2.setName("Dumbledore");
		wiz2.setHealth(100);
		wiz2.setKey(2);
		wiz2.isLocked();
		
		System.out.println(wiz2.toString());
		
		
		wiz2.takeDamage(27);
		
		System.out.println(wiz2.toString());
		
		wiz2.lock(2);
		System.out.println(wiz2.toString());
		
		wiz2.takeDamage(45);
		System.out.println(wiz2.toString());
		
		wiz2.unlock(2);
		
		
		if(wiz2.isLocked()== true) {
		System.out.println("The Wizard "+wiz2.getName()+" has "+wiz2.getHealth()+" health, a key of "+wiz2.getKey()+" this wizard is locked and cannot receive damage.");
		}
		else{
		System.out.println("The Wizard "+wiz2.getName()+" has "+wiz2.getHealth()+" health, a key of "+wiz2.getKey()+" this wizard is unlocked and can receive damage.");	
		}
	}
	
}
