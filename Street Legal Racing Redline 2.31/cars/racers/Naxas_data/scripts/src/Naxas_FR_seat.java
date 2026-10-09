package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FR_seat extends FrontSeat
{
	public Naxas_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Naxas passenger's seat";
		description = "Stock passenger's seat for Naxas models.";

		value = tHUF2USD(279.575);
		brand_new_prestige_value = 37.61;
	}
}
