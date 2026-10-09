package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_bumper extends Bumper
{
	public Sunset_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E96S rear bumper";
		description = "Stock rear bumper for the Sunset E96S.";

		value = tHUF2USD(79.336);
		brand_new_prestige_value = 22.08;
	}
}
