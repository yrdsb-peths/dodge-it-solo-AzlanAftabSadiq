import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Bomb bomb = new Bomb ();
        addObject(bomb, 600, 100);
        
        Life life1 = new Life ();
        addObject(life1, 30, 30);
        
        Life life2 = new Life ();
        addObject(life2, 90, 30);
        
        Life life3 = new Life ();
        addObject(life3, 150, 30);
    }
}
