package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FL_seat extends FrontSeat
{
	public Ninja_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ninja driver's seat";
		description = "Stock driver's seat for Ninja models.";

		value = tHUF2USD(60.346);
		brand_new_prestige_value = 21.70;
	}
}
