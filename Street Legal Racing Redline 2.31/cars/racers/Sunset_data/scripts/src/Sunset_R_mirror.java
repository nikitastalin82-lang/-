package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_mirror extends Mirror
{
	public Sunset_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E96S right mirror";
		description = "Stock right mirror for the Sunset E96S.";

		value = tHUF2USD(28.485);
		brand_new_prestige_value = 26.04;
	}
}
