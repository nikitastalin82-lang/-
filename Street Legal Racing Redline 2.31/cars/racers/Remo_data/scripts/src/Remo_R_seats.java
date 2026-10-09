package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_seats extends RearSeat
{
	public Remo_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo rear seats";
		description = "Stock rear seats for Remo models.";

		value = tHUF2USD(71.107);
		brand_new_prestige_value = 25.81;
	}
}
