package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_L_headlights_halo_blue extends Headlights
{
	public Sunset_L_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset halogen blue left headlights";
		description = "Halo blue left headlights for Sunset models.";

		value = tHUF2USD(122.300);
		brand_new_prestige_value = 49.89;
	}
}
