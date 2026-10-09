package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_seats extends RearSeat
{
	public Ninja_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja rear seats";
		description = "Stock rear seats for Ninja models.";

		value = tHUF2USD(100.180);
		brand_new_prestige_value = 27.65;
	}
}
