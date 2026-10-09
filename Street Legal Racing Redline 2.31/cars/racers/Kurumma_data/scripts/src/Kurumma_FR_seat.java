package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FR_seat extends FrontSeat
{
	public Kurumma_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Kurumma passenger's seat";
		description = "Stock passenger's seat for Kurumma models.";

		value = tHUF2USD(96.427);
		brand_new_prestige_value = 31.82;
	}
}
