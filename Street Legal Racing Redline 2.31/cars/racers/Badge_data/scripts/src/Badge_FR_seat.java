package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_seat extends FrontSeat
{
	public Badge_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Badge passenger's seat";
		description = "Stock passenger's seat for the Badge models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 31.82;
	}
}
