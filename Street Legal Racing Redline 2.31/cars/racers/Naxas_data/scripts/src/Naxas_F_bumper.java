package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_F_bumper extends Bumper
{
	public Naxas_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Tornado front bumper";
		description = "Stock front bumper for the Naxas Tornado.";

		value = tHUF2USD(303.84);
		brand_new_prestige_value = 31.90;
	}
}
