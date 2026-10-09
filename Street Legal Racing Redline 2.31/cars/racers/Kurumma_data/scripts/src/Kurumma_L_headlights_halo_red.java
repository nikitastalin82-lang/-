package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_L_headlights_halo_red extends Headlights
{
	public Kurumma_L_headlights_halo_red( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma halogen red left headlights";
		description = "Halo red left headlights for Kurumma models.";

		value = tHUF2USD(176.197);
		brand_new_prestige_value = 61.22;
	}
}
