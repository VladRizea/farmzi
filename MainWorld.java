import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{

    //X si Y sunt 2 variabile menite sa retina coordonatele de inaltime si...
    //...latime folosite pentru generarea diverselor obiecte
    public int Y = getHeight();
    public int X = 60;
    
    public MainWorld()
    {    
        //Generarea inaltimii (401) si latimii(600)
        super(600, 401, 1);
        //Ordinea imaginilor pe panza
        setPaintOrder(fenceTop.class,player.class ,  wreckedHouse.class, treeTop.class,treeBottom.class, 
         fenceBottom.class, dirtTile.class, dirtTileCap.class
        );
        //Generarea stratului principal de placi izometrice
        prepareTiles();
        //Generarea drumului principal exterior
        prepareRoad();
        //Generarea gardului
        prepareFence();
        //Generarea copacilor
        prepareTrees();
        //Generarea lacului
        prepareLake();
    }
    //Generarea stratului principal de placi izometrice
    public void prepareTiles()
    {   
        for(int j=0;j<=getHeight();j+=40)
        {
            for(int i=getWidth();i>=0;i-=60){
                addObject(new grassTile(), i, j);
                if(j != 0 && i!=0 )
                    addObject(new grassTile(), i-30, j-20);
            }
        }
    }
    //Generarea drumului principal exterior
    public void prepareRoad()
    {   
        Y = getHeight();
        X = 60;
        while(this.Y>180)
        {
            addObject(new dirtTile(), X, Y);
            this.X+=30;
            this.Y-=20;
        }
        //Capatul drumului
        addObject(new dirtTileCap(), X, Y);
        //Pozitionarea casei
        this.X+=45;
        this.Y-=50;
        addObject(new wreckedHouse(), X, Y);
    }
    //Generarea gardului
    public void prepareFence()
    {
        //Inaltimea initiala de plecare
        Y = 200;
        //Latimea originala de plecare
        X = 0;
        //Generare gard pe directia E-S
        while(this.Y<getHeight()-100)
        {
            addObject(new fenceBottom(), X, Y);
            addObject(new fenceTop(), X, Y-40);
            this.X+=30;
            this.Y+=20;
        }
        //Pauza pentru drum
        this.X+=30;
        this.Y+=20;
        //Continuarea generarii gardului pe directia E-S
        while(this.Y<=getHeight())
        {
            addObject(new fenceBottom(), X, Y);
            addObject(new fenceTop(), X, Y-40);
            this.X+=30;
            this.Y+=20;
         }

    }
    //Generarea copacilor
    public void prepareTrees()
    {   

        Y = 60;
        X = 240;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = 40;
        X = 300;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = 50;
        X = 360;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = 40;
        X = getWidth() - 180;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        
        Y = 80;
        X = getWidth() - 80;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = 140;
        X = getWidth() - 40;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 70;
        X = getWidth() - 110;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 170;
        X = getWidth() - 20;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 140;
        X = getWidth() - 70;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 90;
        X = getWidth() - 40;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 40;
        X = getWidth() - 70;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 20;
        X = getWidth() - 140;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
        
        Y = getHeight() - 10;
        X = getWidth() - 20;
        addObject(new treeBottom(), X, Y);
        addObject(new treeTop(), X, Y-40);
    }
    //prepararea lacului
    public void prepareLake()
    {
        //Inaltimea initiala a semnului de avertizare
        Y = 100;
        //Latimea originala a semnului de avertizare
        X = 100;
        //asezarea semnului de avertizare
        addObject(new lake(), X, Y);

    }
}
