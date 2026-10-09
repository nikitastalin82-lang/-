package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_bumper_2 extends Bumper
{
	public Sunset_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E98T bumper";
		description = "Stock rear bumper for the Sunset E98T.";

		value = tHUF2USD(85.033);
		brand_new_prestige_value = 36.26;
	}
}
