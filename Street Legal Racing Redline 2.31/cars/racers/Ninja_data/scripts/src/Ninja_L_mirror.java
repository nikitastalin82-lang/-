package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_mirror extends Mirror
{
	public Ninja_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch left mirror";
		description = "Stock left mirror for the Ninja TurboHatch.";

		value = tHUF2USD(23.21);
		brand_new_prestige_value = 21.70;
	}
}
