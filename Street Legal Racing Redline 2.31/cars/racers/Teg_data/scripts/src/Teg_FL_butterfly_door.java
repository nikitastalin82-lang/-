package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FL_butterfly_door extends FrontDoor
{
	public Teg_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg butterfly driver's door";
		description = "Butterfly type driver's door for Teg models.";

		value = tHUF2USD(61.104);
		brand_new_prestige_value = 49.68;
	}
}
