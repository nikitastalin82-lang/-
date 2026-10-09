package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_bumper_2 extends Bumper
{
	public Ninja_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja PowerLine bumper";
		description = "Stock rear bumper for Ninja PowerLine models.";

		value = tHUF2USD(79.969);
		brand_new_prestige_value = 30.21;
	}
}
