package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_headlights_halo_aqua extends Headlights
{
	public Coyot_L_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot halogen aqua left headlights";
		description = "Halo aqua left headlights for Coyot models.";

		value = tHUF2USD(152.187);
		brand_new_prestige_value = 52.48;
	}
}
