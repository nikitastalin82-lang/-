package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_headlights_halo_aqua extends Headlights
{
	public Axis_R_headlights_halo_aqua( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis halogen aqua right headlights";
		description = "Halo aqua right headlights for Axis models.";

		value = tHUF2USD(126.91);
		brand_new_prestige_value = 56.12;
	}
}
