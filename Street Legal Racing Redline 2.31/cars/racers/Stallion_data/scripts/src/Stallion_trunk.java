package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_trunk extends Trunk
{
	public Stallion_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion trunk";
		description = "Stock trunk for Stallion models.";

		value = tHUF2USD(110.353);
		brand_new_prestige_value = 26.99;
	}
}
