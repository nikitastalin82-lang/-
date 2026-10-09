package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_headlights_halo_green extends Headlights
{
	public Codrac_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac halogen green right headlights";
		description = "Halo green right headlights for Codrac models.";

		value = tHUF2USD(133.200);
		brand_new_prestige_value = 49.91;
	}
}
