package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_seat extends FrontSeat
{
	public Stallion_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Stallion stock driver's seat";
		description = "Stock driver's seat for Stallion models.";

		value = tHUF2USD(83.556);
		brand_new_prestige_value = 31.82;
	}
}
