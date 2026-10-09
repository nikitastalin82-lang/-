package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_headlights_halo_orange extends Headlights
{
	public Axis_L_headlights_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis halogen orange left headlights";
		description = "Halo orange left headlights for the Axis models.";

		value = tHUF2USD(126.91);
		brand_new_prestige_value = 56.12;
	}
}
