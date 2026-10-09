package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_headlights_halo_blue extends Headlights
{
	public Naxas_R_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas halogen blue right headlights";
		description = "Halo blue right headlights for Naxas models.";

		value = tHUF2USD(432.286);
		brand_new_prestige_value = 67.19;
	}
}
