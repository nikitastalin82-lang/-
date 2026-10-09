package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_headlights_halo_purple extends Headlights
{
	public Codrac_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac halogen purple right headlights";
		description = "Halo purple right headlights for Codrac models.";

		value = tHUF2USD(133.200);
		brand_new_prestige_value = 49.91;
	}
}
