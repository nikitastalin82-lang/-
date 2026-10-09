package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_headlights_halo_green extends Headlights
{
	public Teg_L_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg halogen green left headlights";
		description = "Halo green left headlights for Teg models.";

		value = tHUF2USD(133.250);
		brand_new_prestige_value = 59.69;
	}
}
