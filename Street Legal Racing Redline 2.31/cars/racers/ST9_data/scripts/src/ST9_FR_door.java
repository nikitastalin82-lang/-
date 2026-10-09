package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FR_door extends FrontDoor
{
	public ST9_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock passenger's door";
		description = "Stock passenger's door for ST9 models.";

		value = tHUF2USD(86.932);
		brand_new_prestige_value = 41.47;
	}
}
