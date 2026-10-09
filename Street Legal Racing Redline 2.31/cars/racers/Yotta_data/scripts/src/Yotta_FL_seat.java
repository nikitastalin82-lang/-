package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FL_seat extends FrontSeat
{
	public Yotta_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Yotta driver's seat";
		description = "Stock driver's seat for Yotta models.";

		value = tHUF2USD(73.217);
		brand_new_prestige_value = 31.82;
	}
}
