package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_trunk extends Trunk
{
	public Badge_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge trunk";
		description = "Stock trunk for Badge models.";

		value = tHUF2USD(45.787);
		brand_new_prestige_value = 26.99;
	}
}
