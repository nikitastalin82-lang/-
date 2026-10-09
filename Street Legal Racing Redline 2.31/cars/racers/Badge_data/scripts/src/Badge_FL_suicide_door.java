package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_suicide_door extends FrontDoor
{
	public Badge_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge suicide driver's door";
		description = "Suicide type driver's door for Badge models.";

		value = tHUF2USD(111.817);
		brand_new_prestige_value = 56.12;
	}
}
