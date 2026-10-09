package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_headlights_halo_red extends Headlights
{
	public Teg_R_headlights_halo_red( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg halogen red right headlights";
		description = "Halo red right headlights for Teg models.";

		value = tHUF2USD(133.250);
		brand_new_prestige_value = 59.69;
	}
}
