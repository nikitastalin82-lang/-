package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_RR_door extends RearDoor
{
	public Coyot_RR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock rear right door";
		description = "Stock passenger's door for Coyot models.";

		value = tHUF2USD(86.721);
		brand_new_prestige_value = 26.04;
	}
}
