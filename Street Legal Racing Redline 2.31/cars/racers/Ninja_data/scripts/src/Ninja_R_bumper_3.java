package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_bumper_3 extends Bumper
{
	public Ninja_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja Tourer rear bumper";
		description = "Stock rear bumper for the Ninja Tourer.";

		value = tHUF2USD(185.891);
		brand_new_prestige_value = 37.70;

	}
}
