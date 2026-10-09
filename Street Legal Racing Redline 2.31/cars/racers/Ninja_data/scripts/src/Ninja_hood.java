package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_hood extends Hood
{
	public Ninja_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch/PowerLine hood";
		description = "Stock hood for Ninja TurboHatch/PowerLine models.";

		value = tHUF2USD(116.05);
		brand_new_prestige_value = 18.40;
	}
}
