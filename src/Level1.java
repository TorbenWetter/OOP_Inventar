import greenfoot.*;


/**
 * First level of our game
 *
 * @author SAE
 */
public class Level1 extends World {

    /**
     * Constructor for objects of class Level1.
     */
    public Level1() {
        super(10, 10, 60);  //Konstruktor der super Klasse aufrufen mit den Parametern worldWidth, worldHeight, cellSize
        setBackground("tiles/cell.jpg"); //Felder auf den Hintergrund malen
        setPaintOrder(Player.class);  //Player is painted last




        Player player = new Player();
        addObject(player, 4, 4);

        
        /*Aufgabe1: 
        a)  Erzeuge einen neuen Fels (Rock). Platziere den Fels auf (5, 5).
        b)  Erstelle eine Karotte mit dem Gewicht 12 und platziere sie auf dem Feld (1, 5).
        c)  Erstelle eine weitere Karotte mit dem Gewicht 3 und platziere sie auf dem Feld (1, 6).
        d)  Fülle die komplette 7. Spalte der Welt Level1 mit Felsen auf.*/

        for (int i = 0; i < 4; i++) {
            addObject(new Carrot(i), i, i);
        }
    }

}
