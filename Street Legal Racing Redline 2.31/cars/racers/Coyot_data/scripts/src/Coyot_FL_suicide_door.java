package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FL_suicide_door extends FrontDoor
{
	public Coyot_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot suicide driver's door";
		description = "Suicide type driver's door for Coyot models.";

		value = tHUF2USD(112.197);
		brand_new_prestige_value = 59.12;
	}
}
