package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_L_headlights_halo_pink extends Headlights
{
	public Sunset_L_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset halogen pink left headlights";
		description = "Halo pink left headlights for Sunset models.";

		value = tHUF2USD(122.300);
		brand_new_prestige_value = 49.89;
	}
}
