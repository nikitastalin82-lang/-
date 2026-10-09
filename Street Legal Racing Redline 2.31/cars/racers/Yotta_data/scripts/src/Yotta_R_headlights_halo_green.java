package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_headlights_halo_green extends Headlights
{
	public Yotta_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta halogen green right headlights";
		description = "Halo green right headlights for Yotta models.";

		value = tHUF2USD(202.937);
		brand_new_prestige_value = 61.20;
	}
}
