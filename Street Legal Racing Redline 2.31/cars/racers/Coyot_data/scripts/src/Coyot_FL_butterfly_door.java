package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FL_butterfly_door extends FrontDoor
{
	public Coyot_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot butterfly driver's door";
		description = "Butterfly type driver's door for Coyot models.";

		value = tHUF2USD(101.387);
		brand_new_prestige_value = 59.12;
	}
}
