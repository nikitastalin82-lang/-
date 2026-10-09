package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_mirror extends Mirror
{
	public Furrano_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano right mirror";
		description = "Stock right mirror for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(165.002);
	}
}