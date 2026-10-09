package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FL_suicide_door extends FrontDoor
{
	public Ninja_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja suicide driver's door";
		description = "Suicide type driver's door for Ninja models.";

		value = tHUF2USD(66.937);
		brand_new_prestige_value = 60.12;
	}
}
