package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_windshield extends Windshield
{
	public Codrac_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac rear windshield";
		description = "Stock rear windshield for Codrac models.";

		value = tHUF2USD(194.753);
		brand_new_prestige_value = 23.14;
	}
}
