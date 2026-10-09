package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FL_seat extends FrontSeat
{
	public Kurumma_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kurumma driver's seat";
		description = "Stock driver's seat for Kurumma models.";

		value = tHUF2USD(96.427);
		brand_new_prestige_value = 31.82;
	}
}
