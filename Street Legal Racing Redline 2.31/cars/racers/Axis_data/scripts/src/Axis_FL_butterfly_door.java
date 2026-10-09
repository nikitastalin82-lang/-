package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_butterfly_door extends FrontDoor
{
	public Axis_FL_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis butterfly driver's door";
		description = "The butterfly type driver's door for the Axis models.";

		value = tHUF2USD(93.711);
		brand_new_prestige_value = 57.31;
	}
}
