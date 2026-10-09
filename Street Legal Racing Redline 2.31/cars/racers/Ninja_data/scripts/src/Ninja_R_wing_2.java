package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_wing_2 extends Wing
{
	public Ninja_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja trunk wing";
		description = "Stock trunk wing for Ninja models.";

		value = tHUF2USD(95.372);
		brand_new_prestige_value = 21.70;

	}
}
