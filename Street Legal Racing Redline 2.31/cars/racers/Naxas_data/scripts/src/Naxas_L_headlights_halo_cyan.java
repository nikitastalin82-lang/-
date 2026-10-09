package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_L_headlights_halo_cyan extends Headlights
{
	public Naxas_L_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen cyan left headlights";
		description = "Halo cyan left headlights for Naxas models.";

		value = tHUF2USD(432.286);
		brand_new_prestige_value = 67.19;
	}
}
