package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;



public class Stallion_R_door extends HatchDoor
{
	public Stallion_R_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion hatch door";
		description = "Stock hatch door for Stallion models.";

		value = tHUF2USD(138.627);
		brand_new_prestige_value = 31.82;
	}
}
