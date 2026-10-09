package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_trunk extends Trunk
{
	public Sunset_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset trunk";
		description = "Stock trunk for Sunset models.";

		value = tHUF2USD(53.594);
		brand_new_prestige_value = 22.08;
	}
}
