package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_L_headlights_halo_blue extends Headlights
{
	public Kurumma_L_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma halogen blue left headlights";
		description = "Halo blue left headlights for Kurumma models.";

		value = tHUF2USD(176.197);
		brand_new_prestige_value = 61.22;
	}
}
