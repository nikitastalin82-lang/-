package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_headlights_halo_green extends Headlights
{
	public Kurumma_R_headlights_halo_green( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma halogen green right headlights";
		description = "Halo green right headlights for Kurumma models.";

		value = tHUF2USD(176.197);
		brand_new_prestige_value = 61.22;
	}
}
