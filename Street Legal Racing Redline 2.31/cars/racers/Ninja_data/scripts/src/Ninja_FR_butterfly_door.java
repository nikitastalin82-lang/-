package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FR_butterfly_door extends FrontDoor
{
	public Ninja_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja butterfly passenger's door";
		description = "Butterfly type passenger's door for Ninja models.";

		value = tHUF2USD(60.202);
		brand_new_prestige_value = 60.12;
	}
}
