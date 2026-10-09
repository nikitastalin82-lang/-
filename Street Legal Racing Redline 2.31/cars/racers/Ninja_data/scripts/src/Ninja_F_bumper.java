package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_F_bumper extends Bumper
{
	public Ninja_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch front bumper";
		description = "Stock front bumper for the Ninja TurboHatch.";

		value = tHUF2USD(52.75);
		brand_new_prestige_value = 18.40;
	}
}
