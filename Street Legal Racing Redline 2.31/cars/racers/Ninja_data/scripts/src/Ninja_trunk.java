package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_trunk extends Trunk
{
	public Ninja_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja trunk";
		description = "Stock trunk for Ninja models.";

		value = tHUF2USD(50.64);
		brand_new_prestige_value = 18.40;
	}
}
