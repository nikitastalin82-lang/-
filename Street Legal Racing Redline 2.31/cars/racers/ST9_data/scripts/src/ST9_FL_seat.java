package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FL_seat extends FrontSeat
{
	public ST9_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "ST9 driver's seat";
		description = "Stock driver's seat for ST9 models.";

		value = tHUF2USD(59.713);
		brand_new_prestige_value = 30.38;
	}
}
