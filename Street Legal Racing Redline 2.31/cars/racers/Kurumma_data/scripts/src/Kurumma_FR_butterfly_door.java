package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FR_butterfly_door extends FrontDoor
{
	public Kurumma_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma butterfly passenger's door";
		description = "Butterfly type passenger's door for Kurumma models.";

		value = tHUF2USD(120.99);
		brand_new_prestige_value = 55.40;
	}
}
