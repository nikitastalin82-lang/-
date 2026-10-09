package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FR_door extends FrontDoor
{
	public Kurumma_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma stock passenger's door";
		description = "Stock passenger's door for Kurumma models.";

		value = tHUF2USD(92.84);
		brand_new_prestige_value = 31.82;
	}
}
