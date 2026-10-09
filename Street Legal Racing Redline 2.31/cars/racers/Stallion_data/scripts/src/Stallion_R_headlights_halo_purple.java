package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_headlights_halo_purple extends Headlights
{
	public Stallion_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion halogen purple right headlights";
		description = "Halo purple right headlights for Stallion models.";

		value = tHUF2USD(112.84);
		brand_new_prestige_value = 66.30;
	}
}
