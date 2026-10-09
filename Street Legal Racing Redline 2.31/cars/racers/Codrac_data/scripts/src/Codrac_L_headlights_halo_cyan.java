package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_headlights_halo_cyan extends Headlights
{
	public Codrac_L_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac halogen cyan left headlights";
		description = "Halo cyan left headlights for Codrac models.";

		value = tHUF2USD(133.200);
		brand_new_prestige_value = 49.91;
	}
}
