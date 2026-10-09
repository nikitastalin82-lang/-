package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_headlights_halo_cyan extends Headlights
{
	public Teg_L_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg halogen cyan left headlights";
		description = "Halo cyan left headlights for Teg models.";

		value = tHUF2USD(133.250);
		brand_new_prestige_value = 59.69;
	}
}
