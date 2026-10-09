package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_headlights_halo_blue extends Headlights
{
	public Ninja_L_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja halogen blue left headlights";
		description = "Halo blue left headlights for Ninja models.";

		value = tHUF2USD(97.31);
		brand_new_prestige_value = 55.93;
	}
}
