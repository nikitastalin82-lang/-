package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FR_seat extends FrontSeat
{
	public Ninja_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Ninja passenger's seat";
		description = "Stock passenger's seat for Ninja models.";

		value = tHUF2USD(60.346);
		brand_new_prestige_value = 21.70;
	}
}
