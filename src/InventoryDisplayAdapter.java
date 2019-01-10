import greenfoot.*;

import java.io.File;

/**
 * Class used to display an Array of Actors at the bottom of the screen.
 */
public class InventoryDisplayAdapter extends Actor {

    private Actor[] items;
    private Actor[] itemImages;
    private GreenfootImage emtpySlot = new GreenfootImage("./images/tiles/EmptySlot.png".replace("/", File.separator));

    public InventoryDisplayAdapter(int size) {
        getImage().setTransparency(0);
        items = new Actor[size];
        itemImages = new Actor[size];

    }

    /**
     * Method of Actor, will be called once the Adapter will be added/inserted (in)to the world.
     * @param world target world
     */
    protected void addedToWorld(World world){
        for (int i = 0; i<itemImages.length; i++ ){
            itemImages[i] = createDummyImageActor(i);
        }
    }



    /**
     * Updates all visible inventory Slots at the bottom of the screen.
     * The Array of Actors will be the content that shall be displayed at the bottom of the screen.
     * @param inventory Array that shall be displayed
     */
    public void update(Actor[] inventory) {
		int length = Math.max(inventory.length, items.length);
        for (int i = 0; i < length; i++) {
            if (inventory[i] != items[i]) {
                items[i] = inventory[i];
                itemImages[i] = null;
                Actor dummyImageActor = createDummyImageActor(i);
                if(inventory[i] != null){
                    itemImages[i] = dummyImageActor;
                    dummyImageActor.getImage().drawImage(new GreenfootImage(inventory[i].getImage()), 5, 5);
                }
            }
        }

    }

    /**
     * Updates all visible inventory Slots at the bottom of the screen.
     * The single Actor will be the only content that shall be displayed at the bottom of the screen.
     * @param inventory single Actor that shall be displayed
     */
    public void update(Actor inventory) {
        Actor inventorySlots[] = { inventory };
        update(inventorySlots);
    }

    private Actor createDummyImageActor(int i) {
        Actor actor = new Actor() {
        };
        getWorld().addObject(actor, i, getY());
        itemImages[i] = actor;
        actor.setImage(new GreenfootImage(emtpySlot));

        return itemImages[i];

    }

}
