package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_seat extends FrontSeat
{
	public Axis_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Axis driver's seat";
		description = "The stock driver's seat for Axis models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 28.93;
	}
}
