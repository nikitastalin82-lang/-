package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_F_bumper extends Bumper
{
	public Yotta_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock front bumper";
		description = "Stock front bumper for Yotta models.";

		value = tHUF2USD(108.032);
		brand_new_prestige_value = 26.99;
	}
}
