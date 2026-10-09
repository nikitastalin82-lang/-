package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_hood_3 extends Hood
{
	public Coyot_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot tuner hood";
		description = "Stylized hood for Coyot.";

		value = tHUF2USD(292.657);
		brand_new_prestige_value = 45.23;
	}
}
