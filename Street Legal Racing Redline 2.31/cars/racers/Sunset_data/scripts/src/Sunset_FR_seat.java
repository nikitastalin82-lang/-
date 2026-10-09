package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FR_seat extends FrontSeat
{
	public Sunset_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Sunset passenger's seat";
		description = "Stock passenger's seat for Sunset models.";

		value = tHUF2USD(79.125);
		brand_new_prestige_value = 26.04;
	}
}
