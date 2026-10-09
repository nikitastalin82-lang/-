package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_F_bumper_2 extends Bumper
{
	public Sunset_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E98T front bumper";
		description = "Stock front bumper for the Sunset E98T.";

		value = tHUF2USD(119.004);
		brand_new_prestige_value = 36.26;
	}
}
