import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AssetSetter {

	GameEngine gp;
	public int mapTilenum[][];
	public AssetSetter(GameEngine gp) {
		this.gp=gp;
		mapTilenum = new int[gp.maxScreenCol][gp.maxScreenRow];
	}
	public void setMonster() {
		gp.ghost[0] = new Ghost(gp,1);
		gp.ghost[0].x = gp.titleSize *10;
		gp.ghost[0].y = gp.titleSize *4;
		
		gp.ghost[1] = new Ghost(gp,2);
		gp.ghost[1].x = gp.titleSize *11;
		gp.ghost[1].y = gp.titleSize *4;
		
		gp.ghost[2] = new Ghost(gp,3);
		gp.ghost[2].x = gp.titleSize *12;
		gp.ghost[2].y = gp.titleSize *5;
		
		gp.ghost[3] = new Ghost(gp,4);
		gp.ghost[3].x = gp.titleSize *13;
		gp.ghost[3].y = gp.titleSize *5;
		
		
		
	}
	   public void setObject() {
	        try {
	            InputStream is = getClass().getResourceAsStream("/pacman/mappa/mappa01.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(is));
	            int col =0;
	            int row=0;
	            int contatore = 0;
	            while(col < gp.maxScreenCol && row < gp.maxScreenRow) {
	                
	                String line = br.readLine();
	                while(col < gp.maxScreenCol) {
	                    
	                    String numbers[] = line.split(" ");
	                    int num = Integer.parseInt(numbers[col]);
	                    mapTilenum[col][row] = num;
	                    if(mapTilenum[col][row] == 0) {
	                        gp.obj[contatore]=new ObjCFU(); //il numero � un indice per l'elemento
	                        gp.obj[contatore].x=col * gp.titleSize; //riga della mappa
	                        gp.obj[contatore].y=row * gp.titleSize; //colonna della mappa
	                        contatore++;
	                    }
	                   
	                    if(mapTilenum[col][row]==15) {
	                    	gp.obj[contatore]=new PowerUp(); //il numero � un indice per l'elemento
	                        gp.obj[contatore].x=col * gp.titleSize; //riga della mappa
	                        gp.obj[contatore].y=row * gp.titleSize; //colonna della mappa
	                        contatore++;
	                    }
	                    col++;
	                    	
	                }
	                if(col == gp.maxScreenCol) {
	                    col =0;
	                    row++;
	                }
	                
	            }
	            br.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        /*
	        gp.obj[1]=new ObjCFU();
	        gp.obj[1].X=23*gp.titleSize;
	        gp.obj[1].Y=40*gp.titleSize;
	        */
	    }
}
	