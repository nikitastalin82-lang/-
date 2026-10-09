package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_suicide_door extends FrontDoor
{
	public Badge_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge suicide passenger's door";
		description = "Suicide type passenger's door for Badge models.";

		value = tHUF2USD(111.817);
		brand_new_prestige_value = 56.12;
	}

}
