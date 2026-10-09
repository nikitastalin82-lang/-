package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_door extends FrontDoor
{
	public Axis_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock driver's door";
		description = "The stock driver's door for the Axis models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 28.93;
	}
}
