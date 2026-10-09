package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_windshield extends Windshield
{
	public Axis_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis rear windshield";
		description = "The stock rear windshield for Axis models.";

		value = tHUF2USD(198.34);
		brand_new_prestige_value = 28.93;
	}
}
