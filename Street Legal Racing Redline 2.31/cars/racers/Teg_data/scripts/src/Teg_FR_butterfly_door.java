package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_butterfly_door extends FrontDoor
{
	public Teg_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg butterfly passenger's door";
		description = "Butterfly type passenger's door for Teg models.";

		value = tHUF2USD(61.104);
		brand_new_prestige_value = 49.68;
	}
}
