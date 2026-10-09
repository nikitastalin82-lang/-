package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_hood_3 extends Hood
{
	public Codrac_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac tuner hood";
		description = "Aerodynamic hood for Codrac models.";

		value = tHUF2USD(459.347);
		brand_new_prestige_value = 40.21;
	}
}
