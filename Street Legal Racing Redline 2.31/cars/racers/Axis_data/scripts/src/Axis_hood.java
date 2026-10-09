package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_hood extends Hood
{
	public Axis_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S hood";
		description = "The stock hood for Axis 200S models.";

		value = tHUF2USD(204.881);
		brand_new_prestige_value = 24.54;
	}
}
