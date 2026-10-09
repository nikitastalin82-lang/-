package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FR_seat extends FrontSeat
{
	public Remo_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Remo passenger's seat";
		description = "Stock passenger's seat for Remo models.";

		value = tHUF2USD(68.153);
		brand_new_prestige_value = 20.25;
	}
}
