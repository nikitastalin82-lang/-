package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_seats extends RearSeat
{
	public Axis_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis rear seats";
		description = "Stock rear seats for Axis models.";

		value = tHUF2USD(96.427);
		brand_new_prestige_value = 36.87;
	}
}
