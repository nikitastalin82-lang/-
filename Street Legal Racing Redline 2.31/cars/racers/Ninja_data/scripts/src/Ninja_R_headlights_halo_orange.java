package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_headlights_halo_orange extends Headlights
{
	public Ninja_R_headlights_halo_orange( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja halogen orange right headlights";
		description = "Halo orange right headlights for Ninja models.";

		value = tHUF2USD(97.31);
		brand_new_prestige_value = 55.93;
	}
}
