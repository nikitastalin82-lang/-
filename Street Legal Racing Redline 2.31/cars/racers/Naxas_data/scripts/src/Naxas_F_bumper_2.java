package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_F_bumper_2 extends Bumper
{
	public Naxas_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Lux4000 front bumper";
		description = "Stock front bumper for the Naxas Lux4000.";

		value = tHUF2USD(534.463);
		brand_new_prestige_value = 52.37;
	}
}
