package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_bumper extends Bumper
{
	public Yotta_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock rear bumper";
		description = "Stock rear bumper for Yotta models.";

		value = tHUF2USD(92.84);
		brand_new_prestige_value = 26.99;
	}
}
