package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_trunk extends Trunk
{
	public Axis_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis trunk";
		description = "Stock trunk for Axis models.";

		value = tHUF2USD(77.226);
		brand_new_prestige_value = 24.54;
	}
}
