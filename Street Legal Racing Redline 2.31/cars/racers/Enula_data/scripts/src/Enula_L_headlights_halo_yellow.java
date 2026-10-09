package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_headlights_halo_yellow extends Headlights
{
	public Enula_L_headlights_halo_yellow( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR halogen yellow left headlights";
		description = "The halo yellow left headlights for the WR models.";

		value = tHUF2USD(82.071);
		brand_new_prestige_value = 41.47;
	}
}
