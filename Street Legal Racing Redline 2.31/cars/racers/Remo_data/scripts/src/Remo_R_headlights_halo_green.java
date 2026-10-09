package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_headlights_halo_green extends Headlights
{
	public Remo_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo halogen green right headlights";
		description = "Halo green right headlights for Remo models.";

		value = tHUF2USD(223.137);
		brand_new_prestige_value = 64.18;
	}
}
