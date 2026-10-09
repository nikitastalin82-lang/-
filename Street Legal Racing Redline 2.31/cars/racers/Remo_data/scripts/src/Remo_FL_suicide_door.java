package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FL_suicide_door extends FrontDoor
{
	public Remo_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo suicide driver's door";
		description = "Suicide type driver's door for Remo models.";

		value = tHUF2USD(121.632);
		brand_new_prestige_value = 49.64;
	}
}
