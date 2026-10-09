package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_mirror extends Mirror
{
	public Axis_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S/XT right mirror";
		description = "The stock right mirror for the Axis 200S/XT models.";

		value = tHUF2USD(85.033);
		brand_new_prestige_value = 28.93;
	}
}
