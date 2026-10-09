package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_headlights_halo_red extends Headlights
{
	public Enula_R_headlights_halo_red( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR halogen red right headlights";
		description = "The halo red right headlights for the WR models.";

		value = tHUF2USD(82.071);
		brand_new_prestige_value = 41.47;
	}
}
