package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_L_headlights_halo_orange extends Headlights
{
	public Stallion_L_headlights_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion halogen orange left headlights";
		description = "Halo orange left headlights for Stallion models.";

		value = tHUF2USD(112.84);
		brand_new_prestige_value = 66.30;
	}
}
