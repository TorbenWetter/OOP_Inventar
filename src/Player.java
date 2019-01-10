import greenfoot.Greenfoot;
import greenfoot.World;

import java.util.List;

/**
 * The main character called player.
 * @author SAE
 */
public class Player extends MovingActor {

    //Attribute
    //TODO:
    private Carrot[] inventory = new Carrot[8];
    //1) Attribut vom Typ InventoryDisplayAdapter zum Speichern des Adapters


    //Konstruktoren


    /**
     * This method is called by the Greenfoot system when this actor has been inserted into the world.
     * @param world target world
     */
    public void addedToWorld(World world){
        //TODO: 2) Erstellen Sie ein neues Objekt vom Typ InventoryDisplayAdapter mit der passenden Gr��e.
        //         Speichern Sie das Objekt im passenden Attribut.
        //TODO: 3) InventoryDisplayAdapter in der Welt platzieren (0, H�he der Welt -1) => unten links

    }

    /**
     * Is called once per time unit.
     */
    public void act() {
        performMovement();
        print(10);
        //TODO: 4) InventoryDisplayAdapter aktualisieren => siehe update(....)

        if (Greenfoot.isKeyDown("E")) {
            pick();
        }

        if (Greenfoot.isKeyDown("R")) {
            put();
        }
    }




    //TODO: Steuerung über die Tasten W - A - S - D realisieren
    private void performMovement() {
        if (Greenfoot.isKeyDown("W")) {
            faceUp();
            move();
        }
        if (Greenfoot.isKeyDown("S")) {
            faceDown();
            move();
        }
        if (Greenfoot.isKeyDown("A")) {
            faceLeft();
            move();
        }
        if (Greenfoot.isKeyDown("D")) {
            faceRight();
            move();
        }
    }


    public void pick(){
        List<Carrot> objs = getWorld().getObjectsAt(getX(), getY(), Carrot.class);

        if(objs.size()>0){
            for(int i=0;i<inventory.length;i++){
                if(inventory[i]==null){
                    inventory[i]=objs.get(0);
                    getWorld().removeObject(objs.get(0));
                    return;  //beendet die gesamte Methode
                }
            }
        }
    }

    public void put(){
        for(int i=0;i<inventory.length;i++){
            if(inventory[i]!=null){
                getWorld().addObject(inventory[i], getX(), getY());
                inventory[i]=null;
                return; //beendet die gesamte Methode
            }
        }
    }

    /**
     * moves only one step
     */
    public void move(){
        move(1);
    }


}
