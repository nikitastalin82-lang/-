package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FR_seat extends FrontSeat
{
	public Axis_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Axis passenger's seat";
		description = "The stock passenger's seat for Axis models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 28.93;
	}
}
