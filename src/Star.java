import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 * Temporary visualization of an explosion or animation of an hit.
 */
public class Star extends Environment {
	
	public Star(){
		getImage().scale(40, 40);
		
	}
	
	public void act(){		
		Greenfoot.delay(1);
		getWorld().removeObject(this);
	}

}
