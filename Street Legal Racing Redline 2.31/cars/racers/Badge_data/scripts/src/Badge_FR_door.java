package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_door extends FrontDoor
{
	public Badge_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge stock passenger's door";
		description = "Stock passenger's door for Badge models.";

		value = tHUF2USD(91.363);
		brand_new_prestige_value = 41.47;
	}

}
