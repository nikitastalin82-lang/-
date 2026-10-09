package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FR_seat extends FrontSeat
{
	public Codrac_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Codrac passenger's seat";
		description = "Stock passenger's seat for Codrac models.";

		value = tHUF2USD(69.841);
		brand_new_prestige_value = 23.14;
	}
}
