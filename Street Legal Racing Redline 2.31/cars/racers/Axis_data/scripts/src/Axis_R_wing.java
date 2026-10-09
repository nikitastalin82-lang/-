package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_wing extends Wing
{
	public Axis_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S/XT trunk wing";
		description = "Stock trunk wing for the Axis 200S/XT models.";

		value = tHUF2USD(38.402);
		brand_new_prestige_value = 57.53;

	}
}
