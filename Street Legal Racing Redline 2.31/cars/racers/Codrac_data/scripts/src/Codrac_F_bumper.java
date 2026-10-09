package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_F_bumper extends Bumper
{
	public Codrac_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock front bumper";
		description = "Stock front bumper for Codrac models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 19.63;
	}
}
