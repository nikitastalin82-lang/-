package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_F_bumper extends Bumper
{
	public Teg_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock front bumper";
		description = "Stock front bumper for Teg models.";

		value = tHUF2USD(65.41);
		brand_new_prestige_value = 20.85;
	}
}
