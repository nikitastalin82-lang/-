package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_butterfly_door extends FrontDoor
{
	public Stallion_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion butterfly driver's door";
		description = "Butterfly type driver's door for Stallion models.";

		value = tHUF2USD(87.297);
		brand_new_prestige_value = 49.31;
	}
}
