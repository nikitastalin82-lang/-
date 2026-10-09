package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_hood_3 extends Hood
{
	public Ninja_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja Tourer hood";
		description = "Stock hood for the Ninja Tourer.";

		value = tHUF2USD(185.891);
		brand_new_prestige_value = 37.70;
	}
}
