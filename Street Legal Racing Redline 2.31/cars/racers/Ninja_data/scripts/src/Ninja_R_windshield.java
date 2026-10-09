package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_windshield extends Windshield
{
	public Ninja_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja rear windshield";
		description = "Stock rear windshield for Ninja models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 21.70;
	}
}
