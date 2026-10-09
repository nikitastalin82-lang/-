package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_seat extends FrontSeat
{
	public Teg_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Teg passenger's seat";
		description = "Stock passenger's seat for Teg models.";

		value = tHUF2USD(58.025);
		brand_new_prestige_value = 24.59;
	}
}
