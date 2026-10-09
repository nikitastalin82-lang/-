package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FR_suicide_door extends FrontDoor
{
	public Ninja_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja suicide passenger's door";
		description = "Suicide type passenger's door for Ninja models.";

		value = tHUF2USD(66.937);
		brand_new_prestige_value = 60.12;
	}
}
