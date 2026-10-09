package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_bumper_2 extends Bumper
{
	public Naxas_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Lux4000 custom bumper";
		description = "Custom rear bumper for the Naxas Lux4000.";

		value = tHUF2USD(480.025);
		brand_new_prestige_value = 52.37;
	}
}
