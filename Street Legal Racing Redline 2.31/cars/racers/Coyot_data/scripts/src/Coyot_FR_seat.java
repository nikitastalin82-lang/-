package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FR_seat extends FrontSeat
{
	public Coyot_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Coyot passenger's seat";
		description = "Stock passenger's seat for Coyot models.";

		value = tHUF2USD(69.841);
		brand_new_prestige_value = 26.04;
	}
}
