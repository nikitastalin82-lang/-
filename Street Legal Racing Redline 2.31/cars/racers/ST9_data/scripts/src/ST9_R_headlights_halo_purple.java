package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_headlights_halo_purple extends Headlights
{
	public ST9_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 halogen purple right headlights";
		description = "Halo purple right headlights for ST9 models.";

		value = tHUF2USD(133.876);
		brand_new_prestige_value = 55.12;
	}
}
