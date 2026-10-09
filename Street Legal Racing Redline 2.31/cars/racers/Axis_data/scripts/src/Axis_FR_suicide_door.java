package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FR_suicide_door extends FrontDoor
{
	public Axis_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis suicide passenger's door";
		description = "The suicide type passenger's door for Axis models.";

		value = tHUF2USD(101.562);
		brand_new_prestige_value = 57.31;
	}
}
