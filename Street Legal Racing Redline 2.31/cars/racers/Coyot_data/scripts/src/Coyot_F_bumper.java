package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_bumper extends Bumper
{
	public Coyot_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock front bumper";
		description = "Stock front bumper for Coyot models.";

		value = tHUF2USD(44.31);
		brand_new_prestige_value = 22.08;
	}
}
