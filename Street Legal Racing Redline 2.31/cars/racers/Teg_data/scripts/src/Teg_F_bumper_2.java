package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_F_bumper_2 extends Bumper
{
	public Teg_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg custom front bumper";
		description = "Custom front bumper for Teg models.";

		value = tHUF2USD(137.15);
		brand_new_prestige_value = 34.24;
	}
}
