package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_seats extends RearSeat
{
	public Sunset_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset rear seats";
		description = "Stock rear seats for Sunset models.";

		value = tHUF2USD(102.546);
		brand_new_prestige_value = 33.18;
	}
}
