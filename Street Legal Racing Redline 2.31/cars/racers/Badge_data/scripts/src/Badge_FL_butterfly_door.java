package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_butterfly_door extends FrontDoor
{
	public Badge_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge butterfly driver's door";
		description = "Butterfly type driver's door for Badge models.";

		value = tHUF2USD(102.821);
		brand_new_prestige_value = 56.12;
	}
}
