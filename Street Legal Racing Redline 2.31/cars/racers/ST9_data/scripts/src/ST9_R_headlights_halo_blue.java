package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_headlights_halo_blue extends Headlights
{
	public ST9_R_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 halogen blue right headlights";
		description = "Halo blue right headlights for ST9 models.";

		value = tHUF2USD(133.876);
		brand_new_prestige_value = 55.12;
	}
}
