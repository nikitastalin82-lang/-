package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_trunk extends Trunk
{
	public ST9_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 trunk";
		description = "Stock trunk for ST9 models.";

		value = tHUF2USD(69.841);
		brand_new_prestige_value = 25.76;
	}
}
