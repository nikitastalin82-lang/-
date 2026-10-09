package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_seats extends RearSeat
{
	public Yotta_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta rear seats";
		description = "Stock rear seats for Yotta models.";

		value = tHUF2USD(100.180);
		brand_new_prestige_value = 40.56;
	}
}
