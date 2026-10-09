package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_wing extends Wing
{
	public Yotta_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock trunk wing";
		description = "Stock trunk wing for Yotta models.";

		value = tHUF2USD(76.171);
		brand_new_prestige_value = 90.40;

	}
}
