package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_bumper extends Bumper
{
	public Ninja_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch rear bumper";
		description = "Stock rear bumper for the Ninja TurboHatch.";

		value = tHUF2USD(71.951);
		brand_new_prestige_value = 18.40;
	}
}
