package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_L_headlights_halo_cyan extends Headlights
{
	public Stallion_L_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion halogen cyan left headlights";
		description = "Halo cyan left headlights for Stallion models.";

		value = tHUF2USD(112.84);
		brand_new_prestige_value = 66.30;
	}
}
