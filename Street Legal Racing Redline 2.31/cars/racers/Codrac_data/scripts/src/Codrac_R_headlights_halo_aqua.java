package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_headlights_halo_aqua extends Headlights
{
	public Codrac_R_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac halogen aqua right headlights";
		description = "Halo aqua right headlights for Codrac models.";

		value = tHUF2USD(133.200);
		brand_new_prestige_value = 49.91;
	}
}
