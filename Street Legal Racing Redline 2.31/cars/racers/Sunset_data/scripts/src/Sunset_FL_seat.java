package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FL_seat extends FrontSeat
{
	public Sunset_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Sunset driver's seat";
		description = "Stock driver's seat for Sunset models.";

		value = tHUF2USD(79.125);
		brand_new_prestige_value = 26.04;
	}
}
