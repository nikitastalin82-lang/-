package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FL_seat extends FrontSeat
{
	public Naxas_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Naxas driver's seat";
		description = "Stock driver's seat for Naxas models.";

		value = tHUF2USD(279.575);
		brand_new_prestige_value = 37.61;
	}
}
