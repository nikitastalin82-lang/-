package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FR_seat extends FrontSeat
{
	public Stallion_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Stallion passenger's seat";
		description = "Stock passenger's seat for Stallion models.";

		value = tHUF2USD(83.556);
		brand_new_prestige_value = 31.82;
	}
}
