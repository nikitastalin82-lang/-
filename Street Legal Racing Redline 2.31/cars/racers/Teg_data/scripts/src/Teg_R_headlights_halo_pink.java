package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_headlights_halo_pink extends Headlights
{
	public Teg_R_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg halogen pink right headlights";
		description = "Halo pink right headlights for Teg models.";

		value = tHUF2USD(133.250);
		brand_new_prestige_value = 59.69;
	}
}
