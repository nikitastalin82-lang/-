package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_headlights_halo_green extends Headlights
{
	public Axis_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis halogen green right headlights";
		description = "Halo green right headlights for Axis models.";

		value = tHUF2USD(126.91);
		brand_new_prestige_value = 56.12;
	}
}
