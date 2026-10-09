package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FR_butterfly_door extends FrontDoor
{
	public Stallion_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion butterfly passenger's door";
		description = "Butterfly type passenger's door for Stallion models.";

		value = tHUF2USD(87.297);
		brand_new_prestige_value = 49.31;
	}
}
