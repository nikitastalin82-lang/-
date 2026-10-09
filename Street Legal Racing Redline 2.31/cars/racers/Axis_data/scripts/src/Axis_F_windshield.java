package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_F_windshield extends Windshield
{
	public Axis_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis front windshield";
		description = "The stock front windshield for Axis models.";

		value = tHUF2USD(184.625);
		brand_new_prestige_value = 28.93;
	}
}
