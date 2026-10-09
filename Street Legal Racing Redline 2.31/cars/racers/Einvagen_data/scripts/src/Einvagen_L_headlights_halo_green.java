package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_L_headlights_halo_green extends Headlights
{
	public Einvagen_L_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT halogen green left headlights";
		description = "The halo green left headlights for the GT models.";

		value = tHUF2USD(65.253);
		brand_new_prestige_value = 23.25;
	}
}
