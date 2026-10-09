package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_headlights_halo_green extends Headlights
{
	public Yotta_L_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta halogen green left headlights";
		description = "Halo green left headlights for Yotta models.";

		value = tHUF2USD(202.937);
		brand_new_prestige_value = 61.20;
	}
}
