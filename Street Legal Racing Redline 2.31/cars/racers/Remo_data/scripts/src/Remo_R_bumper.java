package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_bumper extends Bumper
{
	public Remo_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock rear bumper";
		description = "Stock rear bumper for Remo models.";

		value = tHUF2USD(79.336);
		brand_new_prestige_value = 17.17;
	}
}
