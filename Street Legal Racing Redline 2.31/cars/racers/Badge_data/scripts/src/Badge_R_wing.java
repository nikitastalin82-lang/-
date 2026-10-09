package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_wing extends Wing
{
	public Badge_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 trunk wing";
		description = "Stock trunk wing for the Badge '67.";

		value = tHUF2USD(49.585);
		brand_new_prestige_value = 63.28;

	}
}
