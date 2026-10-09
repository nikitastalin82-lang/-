package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_suicide_door extends FrontDoor
{
	public Axis_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis suicide driver's door";
		description = "The suicide type driver's door for the Axis models.";

		value = tHUF2USD(101.562);
		brand_new_prestige_value = 57.31;
	}
}
