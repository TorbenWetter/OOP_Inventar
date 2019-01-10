import greenfoot.Actor;

/**
 * Just a Rock
 */
public class Rock extends Environment
{
	
	
	/**
	 * Will be called on a hit.
	 */
	public void hit(){
		getWorld().addObject(new Star(), getX(), getY()); //Bei einem Treffer wird kurz ein Stern eingeblendet
		
	}

	@Override
	public boolean isBlocking() {
		return true;
	}
}