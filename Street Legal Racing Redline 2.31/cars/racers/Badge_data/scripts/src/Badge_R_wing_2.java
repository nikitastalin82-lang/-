package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_wing_2 extends Wing
{
	public Badge_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO trunk wing";
		description = "Stock trunk wing for the Badge GTO.";

		value = tHUF2USD(79.547);
		brand_new_prestige_value = 76.89;
	}
}
