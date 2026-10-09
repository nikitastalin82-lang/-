package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_F_windshield extends Windshield
{
	public Naxas_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas front windshield";
		description = "Stock front windshield for Naxas models.";

		value = tHUF2USD(324.94);
		brand_new_prestige_value = 37.61;
	}
}
