package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;



public class Ninja_R_door extends HatchDoor
{
	public Ninja_R_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja hatch door";
		description = "Stock hatch door for the GT models.";

		value = tHUF2USD(91.363);
		brand_new_prestige_value = 21.70;
	}
}
