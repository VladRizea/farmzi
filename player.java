
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    GreenfootImage image1 = new GreenfootImage("player/run/run_000.png"); 
    GreenfootImage image2 = new GreenfootImage("player/run/run_001.png");
    GreenfootImage image3 = new GreenfootImage("player/run/run_002.png");
    GreenfootImage image4 = new GreenfootImage("player/run/run_003.png"); 
    GreenfootImage image5 = new GreenfootImage("player/run/run_004.png");
    GreenfootImage image6 = new GreenfootImage("player/run/run_005.png");
    GreenfootImage image7 = new GreenfootImage("player/run/run_006.png");
    GreenfootImage image8 = new GreenfootImage("player/run/run_007.png"); 
    GreenfootImage image9 = new GreenfootImage("player/run/run_008.png");
    GreenfootImage image10 = new GreenfootImage("player/run/run_009.png");
    GreenfootImage image11 = new GreenfootImage("player/run/run_010.png"); 
    GreenfootImage image12 = new GreenfootImage("player/run/run_011.png");
    GreenfootImage image13 = new GreenfootImage("player/run/run_012.png");
    GreenfootImage image14 = new GreenfootImage("player/run/run_013.png");
    GreenfootImage image15 = new GreenfootImage("player/run/run_014.png");
    GreenfootImage image16 = new GreenfootImage("player/run/run_015.png");
    GreenfootImage image17 = new GreenfootImage("player/run/run_016.png");
    GreenfootImage image18 = new GreenfootImage("player/run/run_017.png");
    GreenfootImage image19 = new GreenfootImage("player/run/run_018.png");
    GreenfootImage image20 = new GreenfootImage("player/run/run_019.png");
    GreenfootImage image21 = new GreenfootImage("player/run/run_020.png");
    GreenfootImage image22 = new GreenfootImage("player/run/run_021.png");
    GreenfootImage image23 = new GreenfootImage("player/run/run_022.png");
    GreenfootImage image24 = new GreenfootImage("player/run/run_023.png");
    GreenfootImage image25 = new GreenfootImage("player/run/run_024.png");
    GreenfootImage image26 = new GreenfootImage("player/run/run_025.png");
    GreenfootImage image27 = new GreenfootImage("player/run/run_026.png");
    GreenfootImage image28 = new GreenfootImage("player/run/run_027.png");
    GreenfootImage image29 = new GreenfootImage("player/run/run_028.png");
    GreenfootImage image30 = new GreenfootImage("player/run/run_029.png");
    GreenfootImage image31 = new GreenfootImage("player/run/run_030.png");
    GreenfootImage image32 = new GreenfootImage("player/run/run_031.png");
    GreenfootImage image33 = new GreenfootImage("player/run/run_032.png");
    GreenfootImage image34 = new GreenfootImage("player/run/run_033.png");
    GreenfootImage image35 = new GreenfootImage("player/run/run_034.png");
    GreenfootImage image36 = new GreenfootImage("player/run/run_035.png");
    GreenfootImage image37 = new GreenfootImage("player/run/run_036.png");
    GreenfootImage image38 = new GreenfootImage("player/run/run_037.png");
    GreenfootImage image39 = new GreenfootImage("player/run/run_038.png");
    GreenfootImage image40 = new GreenfootImage("player/run/run_039.png");
    GreenfootImage image41 = new GreenfootImage("player/run/run_040.png");
    GreenfootImage image42 = new GreenfootImage("player/run/run_041.png");
    GreenfootImage image43 = new GreenfootImage("player/run/run_042.png");
    
    GreenfootImage imageFlip1 = new GreenfootImage("player/runFlip/run_000.png"); 
    GreenfootImage imageFlip2 = new GreenfootImage("player/runFlip/run_001.png");
    GreenfootImage imageFlip3 = new GreenfootImage("player/runFlip/run_002.png");
    GreenfootImage imageFlip4 = new GreenfootImage("player/runFlip/run_003.png"); 
    GreenfootImage imageFlip5 = new GreenfootImage("player/runFlip/run_004.png");
    GreenfootImage imageFlip6 = new GreenfootImage("player/runFlip/run_005.png");
    GreenfootImage imageFlip7 = new GreenfootImage("player/runFlip/run_006.png");
    GreenfootImage imageFlip8 = new GreenfootImage("player/runFlip/run_007.png"); 
    GreenfootImage imageFlip9 = new GreenfootImage("player/runFlip/run_008.png");
    GreenfootImage imageFlip10 = new GreenfootImage("player/runFlip/run_009.png");
    GreenfootImage imageFlip11 = new GreenfootImage("player/runFlip/run_010.png"); 
    GreenfootImage imageFlip12 = new GreenfootImage("player/runFlip/run_011.png");
    GreenfootImage imageFlip13 = new GreenfootImage("player/runFlip/run_012.png");
    GreenfootImage imageFlip14 = new GreenfootImage("player/runFlip/run_013.png");
    GreenfootImage imageFlip15 = new GreenfootImage("player/runFlip/run_014.png");
    GreenfootImage imageFlip16 = new GreenfootImage("player/runFlip/run_015.png");
    GreenfootImage imageFlip17 = new GreenfootImage("player/runFlip/run_016.png");
    GreenfootImage imageFlip18 = new GreenfootImage("player/runFlip/run_017.png");
    GreenfootImage imageFlip19 = new GreenfootImage("player/runFlip/run_018.png");
    GreenfootImage imageFlip20 = new GreenfootImage("player/runFlip/run_019.png");
    GreenfootImage imageFlip21 = new GreenfootImage("player/runFlip/run_020.png");
    GreenfootImage imageFlip22 = new GreenfootImage("player/runFlip/run_021.png");
    GreenfootImage imageFlip23 = new GreenfootImage("player/runFlip/run_022.png");
    GreenfootImage imageFlip24 = new GreenfootImage("player/runFlip/run_023.png");
    GreenfootImage imageFlip25 = new GreenfootImage("player/runFlip/run_024.png");
    GreenfootImage imageFlip26 = new GreenfootImage("player/runFlip/run_025.png");
    GreenfootImage imageFlip27 = new GreenfootImage("player/runFlip/run_026.png");
    GreenfootImage imageFlip28 = new GreenfootImage("player/runFlip/run_027.png");
    GreenfootImage imageFlip29 = new GreenfootImage("player/runFlip/run_028.png");
    GreenfootImage imageFlip30 = new GreenfootImage("player/runFlip/run_029.png");
    GreenfootImage imageFlip31 = new GreenfootImage("player/runFlip/run_030.png");
    GreenfootImage imageFlip32 = new GreenfootImage("player/runFlip/run_031.png");
    GreenfootImage imageFlip33 = new GreenfootImage("player/runFlip/run_032.png");
    GreenfootImage imageFlip34 = new GreenfootImage("player/runFlip/run_033.png");
    GreenfootImage imageFlip35 = new GreenfootImage("player/runFlip/run_034.png");
    GreenfootImage imageFlip36 = new GreenfootImage("player/runFlip/run_035.png");
    GreenfootImage imageFlip37 = new GreenfootImage("player/runFlip/run_036.png");
    GreenfootImage imageFlip38 = new GreenfootImage("player/runFlip/run_037.png");
    GreenfootImage imageFlip39 = new GreenfootImage("player/runFlip/run_038.png");
    GreenfootImage imageFlip40 = new GreenfootImage("player/runFlip/run_039.png");
    GreenfootImage imageFlip41 = new GreenfootImage("player/runFlip/run_040.png");
    GreenfootImage imageFlip42 = new GreenfootImage("player/runFlip/run_041.png");
    GreenfootImage imageFlip43 = new GreenfootImage("player/runFlip/run_042.png");
    
    public double time = 60;
    //Numerotarea se face in ordinea wasd 1234
    //Ultima tasta apasata intre a si d(2 si 4)
    public int LastKey = 4;
    public void act() 
    {
        move();
    }
    public void move()
    {   int k=0;
        int x=getX();
        int y=getY();
        
        if(isTouching(fenceBottom.class)){y++; x--;}
        else if(Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("D")){y++; x++; animation();}
        else if(Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("A")){y++; x--; animationFlip();}
        else if(Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("D")){y--; x++; animation();}
        else if(Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("A")){y--; x--; animationFlip();}
        else if(Greenfoot.isKeyDown("A")) {x--; animationFlip(); LastKey = 2;}
        else if(Greenfoot.isKeyDown("D")) {x++;animation();LastKey = 4;}
        else if(Greenfoot.isKeyDown("S") && LastKey == 4){y++; animation();}
        else if(Greenfoot.isKeyDown("S") && LastKey == 2){y++; animationFlip();}
        else if(Greenfoot.isKeyDown("W") && LastKey == 4){y--; animation();}
        else if(Greenfoot.isKeyDown("W") && LastKey == 2){y--; animationFlip();}
        
        
        setLocation(x,y);
    }
    public void animation()
    {
        
        time = time - 1.5;
        if(time == 60)
        {
            setImage(image1);
            
        }
        else if(time == 58.5)
        {
            setImage(image2);
            
        }
        else if(time == 57)
        {
            setImage(image3);
            
        }
        else if(time == 55.5)
        {
            setImage(image4);
            
        }
        else if(time == 54)
        {
            setImage(image5);
            
        }
        else if(time == 52.5)
        {
            setImage(image6);
            
        }
        else if(time == 51)
        {
            setImage(image7);
            
        }
        else if(time == 49.5)
        {
            setImage(image8);
            
        }
        else if(time == 48)
        {
            setImage(image9);
            
        }
        else if(time == 46.5)
        {
            setImage(image10);
            
        }
        else if(time == 45)
        {
            setImage(image11);
            
        }
        else if(time == 43.5)
        {
            setImage(image12);
            
        }
        else if(time == 42)
        {
            setImage(image13);
            
        }
        else if(time == 40.5)
        {
            setImage(image14);
            
        }
        else if(time == 39)
        {
            setImage(image15);
            
        }
        else if(time == 37.5)
        {
            setImage(image16);
            
        }
        
        else if(time == 36)
        {
            setImage(image17);
            
        }
        else if(time == 34.5)
        {
            setImage(image18);
            
        }
        else if(time == 33)
        {
            setImage(image19);
            
        }
        else if(time == 31.5)
        {
            setImage(image20);
            
        }
        else if(time == 30)
        {
            setImage(image21);
            
        }
        else if(time == 28.5)
        {
            setImage(image22);
            
        }
        else if(time == 27)
        {
            setImage(image23);
            
        }
        else if(time == 25.5)
        {
            setImage(image24);
            
        }
        else if(time == 24)
        {
            setImage(image25);
            
        }
        else if(time == 22.5)
        {
            setImage(image26);
            
        }
        else if(time == 21)
        {
            setImage(image27);
            
        }
        else if(time == 19.5)
        {
            setImage(image28);
            
        }
        else if(time == 18)
        {
            setImage(image29);
            
        }
        else if(time == 16.5)
        {
            setImage(image30);
            
        }
        else if(time == 15)
        {
            setImage(image31);
            
        }
        else if(time == 13.4)
        {
            setImage(image32);
            
        }
        else if(time == 12)
        {
            setImage(image33);
            
        }
        else if(time == 10.5)
        {
            setImage(image34);
            
        }
        else if(time == 9)
        {
            setImage(image35);
            
        }
        else if(time == 7.5)
        {
            setImage(image36);
            
        }
        else if(time == 6)
        {
            setImage(image37);
            
        }
        else if(time == 4.5)
        {
            setImage(image38);
            
        }
        else if(time == 3)
        {
            setImage(image39);
            
        }
        else if(time == 1.5)
        {
            setImage(image40);
            
        }
        
        else if(time == 0)
        {
            time = 60;
            
        }
    }
        public void animationFlip()
    {
        
        time = time - 1.5;
        if(time == 60)
        {
            setImage(imageFlip1);
            
        }
        else if(time == 58.5)
        {
            setImage(imageFlip2);
            
        }
        else if(time == 57)
        {
            setImage(imageFlip3);
            
        }
        else if(time == 55.5)
        {
            setImage(imageFlip4);
            
        }
        else if(time == 54)
        {
            setImage(imageFlip5);
            
        }
        else if(time == 52.5)
        {
            setImage(imageFlip6);
            
        }
        else if(time == 51)
        {
            setImage(imageFlip7);
            
        }
        else if(time == 49.5)
        {
            setImage(imageFlip8);
            
        }
        else if(time == 48)
        {
            setImage(imageFlip9);
            
        }
        else if(time == 46.5)
        {
            setImage(imageFlip10);
            
        }
        else if(time == 45)
        {
            setImage(imageFlip11);
            
        }
        else if(time == 43.5)
        {
            setImage(imageFlip12);
            
        }
        else if(time == 42)
        {
            setImage(imageFlip13);
            
        }
        else if(time == 40.5)
        {
            setImage(imageFlip14);
            
        }
        else if(time == 39)
        {
            setImage(imageFlip15);
            
        }
        else if(time == 37.5)
        {
            setImage(imageFlip16);
            
        }
        
        else if(time == 36)
        {
            setImage(imageFlip17);
            
        }
        else if(time == 34.5)
        {
            setImage(imageFlip18);
            
        }
        else if(time == 33)
        {
            setImage(imageFlip19);
            
        }
        else if(time == 31.5)
        {
            setImage(imageFlip20);
            
        }
        else if(time == 30)
        {
            setImage(imageFlip21);
            
        }
        else if(time == 28.5)
        {
            setImage(imageFlip22);
            
        }
        else if(time == 27)
        {
            setImage(imageFlip23);
            
        }
        else if(time == 25.5)
        {
            setImage(imageFlip24);
            
        }
        else if(time == 24)
        {
            setImage(imageFlip25);
            
        }
        else if(time == 22.5)
        {
            setImage(imageFlip26);
            
        }
        else if(time == 21)
        {
            setImage(imageFlip27);
            
        }
        else if(time == 19.5)
        {
            setImage(imageFlip28);
            
        }
        else if(time == 18)
        {
            setImage(imageFlip29);
            
        }
        else if(time == 16.5)
        {
            setImage(imageFlip30);
            
        }
        else if(time == 15)
        {
            setImage(imageFlip31);
            
        }
        else if(time == 13.4)
        {
            setImage(imageFlip32);
            
        }
        else if(time == 12)
        {
            setImage(imageFlip33);
            
        }
        else if(time == 10.5)
        {
            setImage(imageFlip34);
            
        }
        else if(time == 9)
        {
            setImage(imageFlip35);
            
        }
        else if(time == 7.5)
        {
            setImage(imageFlip36);
            
        }
        else if(time == 6)
        {
            setImage(imageFlip37);
            
        }
        else if(time == 4.5)
        {
            setImage(imageFlip38);
            
        }
        else if(time == 3)
        {
            setImage(imageFlip39);
            
        }
        else if(time == 1.5)
        {
            setImage(imageFlip40);
            
        }
        
        else if(time == 0)
        {
            time = 60;
            
        }
    }


}
