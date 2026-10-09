package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_wing_2 extends Wing
{
	public Coyot_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom trunk wing";
		description = "Stylized trunk wing for Coyot models.";

		value = tHUF2USD(107.821);
		brand_new_prestige_value = 62.91;

	}
}
