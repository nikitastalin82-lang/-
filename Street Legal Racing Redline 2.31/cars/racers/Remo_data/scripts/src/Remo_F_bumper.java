package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_F_bumper extends Bumper
{
	public Remo_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock front bumper";
		description = "Stock front bumper for Remo models.";

		value = tHUF2USD(91.363);
		brand_new_prestige_value = 17.17;
	}
}
