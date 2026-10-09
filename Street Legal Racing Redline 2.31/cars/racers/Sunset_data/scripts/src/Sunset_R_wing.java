package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_wing extends Wing
{
	public Sunset_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset trunk wing";
		description = "Stock trunk wing for Sunset models.";

		value = tHUF2USD(51.062);
		brand_new_prestige_value = 51.77;

	}
}
