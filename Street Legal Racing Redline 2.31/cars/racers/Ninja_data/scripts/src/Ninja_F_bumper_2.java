package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_F_bumper_2 extends Bumper
{
	public Ninja_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja PowerLine front bumper";
		description = "Stock front bumper for Ninja PowerLine models.";

		value = tHUF2USD(92.418);
		brand_new_prestige_value = 30.21;
	}
}
