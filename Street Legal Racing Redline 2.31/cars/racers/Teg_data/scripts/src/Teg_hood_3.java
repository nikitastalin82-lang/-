package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_hood_3 extends Hood
{
	public Teg_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg tuner hood";
		description = "Aero hood for Teg models.";

		value = tHUF2USD(151.92);
		brand_new_prestige_value = 42.72;
	}
}
