package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_headlights_halo_pink extends Headlights
{
	public Coyot_R_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot halogen pink right headlights";
		description = "Halo pink right headlights for Coyot models.";

		value = tHUF2USD(152.187);
		brand_new_prestige_value = 52.48;
	}
}
