package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_bumper_3 extends Bumper
{
	public Naxas_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Extreme Edition rear bumper";
		description = "Stock rear bumper for the Naxas Extreme Edition.";

		value = tHUF2USD(628.78);
		brand_new_prestige_value = 65.34;

	}
}
