package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_F_bumper extends Bumper
{
	public Sunset_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E96S front bumper";
		description = "Stock front bumper for the Sunset E96S.";

		value = tHUF2USD(56.126);
		brand_new_prestige_value = 22.08;
	}
}
