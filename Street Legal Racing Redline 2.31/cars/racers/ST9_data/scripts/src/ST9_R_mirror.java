package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_mirror extends Mirror
{
	public ST9_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock right mirror";
		description = "Stock right mirror for ST9 models.";

		value = tHUF2USD(45.576);
		brand_new_prestige_value = 30.38;
	}
}
