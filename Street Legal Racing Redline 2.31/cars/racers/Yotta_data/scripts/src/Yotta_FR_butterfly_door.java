package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FR_butterfly_door extends FrontDoor
{
	public Yotta_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta butterfly passenger's door";
		description = "Butterfly type passenger's door for Yotta models.";

		value = tHUF2USD(93.391);
		brand_new_prestige_value = 63.30;
	}
}
