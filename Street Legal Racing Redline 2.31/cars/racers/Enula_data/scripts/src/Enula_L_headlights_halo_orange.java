package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_headlights_halo_orange extends Headlights
{
	public Enula_L_headlights_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR halogen orange left headlights";
		description = "The halo orange left headlights for the WR models.";

		value = tHUF2USD(82.071);
		brand_new_prestige_value = 41.47;
	}
}
