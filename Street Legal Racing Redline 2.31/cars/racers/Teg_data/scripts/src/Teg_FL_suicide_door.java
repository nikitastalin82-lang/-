package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FL_suicide_door extends FrontDoor
{
	public Teg_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg suicide driver's door";
		description = "Suicide type driver's door for Teg models.";

		value = tHUF2USD(91.127);
		brand_new_prestige_value = 49.68;
	}
}
