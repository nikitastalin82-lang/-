package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_F_windshield extends Windshield
{
	public Teg_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg front windshield";
		description = "Stock front windshield for Teg models.";

		value = tHUF2USD(55.915);
		brand_new_prestige_value = 24.59;
	}
}
