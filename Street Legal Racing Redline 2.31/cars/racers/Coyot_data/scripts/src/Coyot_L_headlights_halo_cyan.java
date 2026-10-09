package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_headlights_halo_cyan extends Headlights
{
	public Coyot_L_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot halogen cyan left headlights";
		description = "Halo cyan left headlights for Coyot models.";

		value = tHUF2USD(152.187);
		brand_new_prestige_value = 52.48;
	}
}
