package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_FR_seat extends FrontSeat
{
	public Furrano_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Furrano passenger's seat";
		description = "Stock passenger's seat for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(190.744);
	}
}
