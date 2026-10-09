package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_headlights_halo_orange extends Headlights
{
	public Yotta_L_headlights_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta halogen orange left headlights";
		description = "Halo orange left headlights for Yotta models.";

		value = tHUF2USD(202.937);
		brand_new_prestige_value = 61.20;
	}
}
