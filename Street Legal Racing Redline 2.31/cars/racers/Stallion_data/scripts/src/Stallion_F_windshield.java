package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_F_windshield extends Windshield
{
	public Stallion_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion front windshield";
		description = "Stock front windshield for Stallion models.";

		value = tHUF2USD(158.883);
		brand_new_prestige_value = 31.82;
	}
}
