package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_headlights_halo_yellow extends Headlights
{
	public Coyot_R_headlights_halo_yellow( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot halogen yellow right headlights";
		description = "Halo yellow right headlights for Coyot models.";

		value = tHUF2USD(152.187);
		brand_new_prestige_value = 52.48;
	}
}
