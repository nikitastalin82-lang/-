package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_trunk extends Trunk
{
	public Yotta_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta trunk";
		description = "Stock trunk for Yotta models.";

		value = tHUF2USD(74.483);
		brand_new_prestige_value = 26.99;
	}
}
