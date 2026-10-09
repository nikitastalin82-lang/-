package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_headlights_halo_green extends Headlights
{
	public Teg_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg halogen green right headlights";
		description = "Halo green right headlights for Teg models.";

		value = tHUF2USD(133.250);
		brand_new_prestige_value = 59.69;
	}
}
