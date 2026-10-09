package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FR_suicide_door extends FrontDoor
{
	public Yotta_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta suicide passenger's door";
		description = "Suicide type passenger's door for Yotta models.";

		value = tHUF2USD(119.185);
		brand_new_prestige_value = 63.30;
	}
}
