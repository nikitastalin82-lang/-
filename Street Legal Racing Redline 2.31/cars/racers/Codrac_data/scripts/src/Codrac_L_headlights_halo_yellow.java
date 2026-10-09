package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_headlights_halo_yellow extends Headlights
{
	public Codrac_L_headlights_halo_yellow( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac halogen yellow left headlights";
		description = "Halo yellow left headlights for Codrac models.";

		value = tHUF2USD(133.200);
		brand_new_prestige_value = 49.91;
	}
}
