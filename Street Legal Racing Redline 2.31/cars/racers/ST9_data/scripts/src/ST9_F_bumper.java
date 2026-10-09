package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_F_bumper extends Bumper
{
	public ST9_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock front bumper";
		description = "Stock front bumper for ST9 models.";

		value = tHUF2USD(101.491);
		brand_new_prestige_value = 25.76;
	}
}
