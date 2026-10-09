package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_door extends FrontDoor
{
	public Badge_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge stock driver's door";
		description = "Stock driver's door for Badge models.";

		value = tHUF2USD(91.363);
		brand_new_prestige_value = 41.47;
	}

}
