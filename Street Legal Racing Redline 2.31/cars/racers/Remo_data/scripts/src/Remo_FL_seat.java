package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FL_seat extends FrontSeat
{
	public Remo_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Remo driver's seat";
		description = "Stock driver's seat for Remo models.";

		value = tHUF2USD(68.153);
		brand_new_prestige_value = 20.25;
	}
}
