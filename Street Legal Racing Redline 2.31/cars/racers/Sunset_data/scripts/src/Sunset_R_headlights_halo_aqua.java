package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_headlights_halo_aqua extends Headlights
{
	public Sunset_R_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset halogen aqua right headlights";
		description = "Halo aqua right headlights for Sunset models.";

		value = tHUF2USD(122.300);
		brand_new_prestige_value = 49.89;
	}
}
