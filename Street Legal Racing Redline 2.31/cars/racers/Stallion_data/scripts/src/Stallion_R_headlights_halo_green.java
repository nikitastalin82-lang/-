package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_headlights_halo_green extends Headlights
{
	public Stallion_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion halogen green right headlights";
		description = "Halo green right headlights for Stallion models.";

		value = tHUF2USD(112.84);
		brand_new_prestige_value = 66.30;
	}
}
