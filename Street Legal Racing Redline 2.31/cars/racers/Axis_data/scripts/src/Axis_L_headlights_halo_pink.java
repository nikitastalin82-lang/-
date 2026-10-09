package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_headlights_halo_pink extends Headlights
{
	public Axis_L_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis halogen pink left headlights";
		description = "Halo pink left headlights for the Axis models.";

		value = tHUF2USD(126.91);
		brand_new_prestige_value = 56.12;
	}
}
