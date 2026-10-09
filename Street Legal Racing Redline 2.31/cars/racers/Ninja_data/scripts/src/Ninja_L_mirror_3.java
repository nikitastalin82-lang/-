package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_mirror_3 extends Mirror
{
	public Ninja_L_mirror_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja Tourer left mirror";
		description = "Stock left mirror for the Ninja Tourer.";

		value = tHUF2USD(100.647);
		brand_new_prestige_value = 29.53;
	}
}
