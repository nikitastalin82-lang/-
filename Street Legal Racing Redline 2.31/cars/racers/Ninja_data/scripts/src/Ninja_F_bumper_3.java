package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_F_bumper_3 extends Bumper
{
	public Ninja_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja Tourer front bumper";
		description = "Stock front bumper for the Ninja Tourer.";

		value = tHUF2USD(149.599);
		brand_new_prestige_value = 37.70;
	}
}
