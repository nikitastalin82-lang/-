package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_F_bumper_3 extends Bumper
{
	public Naxas_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Extreme Edition front bumper";
		description = "Stock front bumper for the Naxas Extreme Edition.";

		value = tHUF2USD(689.97);
		brand_new_prestige_value = 65.34;
	}
}
