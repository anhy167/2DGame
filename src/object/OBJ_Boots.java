package object;

import javax.imageio.ImageIO;

public class OBJ_Boots extends SuperObject{

	public OBJ_Boots() {
		
		name = "boots";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
