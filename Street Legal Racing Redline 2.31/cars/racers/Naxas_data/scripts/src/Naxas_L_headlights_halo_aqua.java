package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_L_headlights_halo_aqua extends Headlights
{
	public Naxas_L_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen aqua left headlights";
		description = "Halo aqua left headlights for Naxas models.";

		value = tHUF2USD(432.286);
		brand_new_prestige_value = 67.19;
	}
}
