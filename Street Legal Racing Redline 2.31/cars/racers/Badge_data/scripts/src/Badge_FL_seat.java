package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_seat extends FrontSeat
{
	public Badge_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Badge driver's seat";
		description = "Stock driver's seat for Badge models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 31.82;
	}
}
