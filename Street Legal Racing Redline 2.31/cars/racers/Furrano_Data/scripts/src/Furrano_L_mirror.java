package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_mirror extends Mirror
{
	public Furrano_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano left mirror";
		description = "Stock left mirror for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(165.002);
	}
}