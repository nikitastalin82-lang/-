package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_headlights_halo_green extends Headlights
{
	public ST9_L_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 halogen green left headlights";
		description = "Halo green left headlights for ST9 models.";

		value = tHUF2USD(133.876);
		brand_new_prestige_value = 55.12;
	}
}
