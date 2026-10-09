package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_seats extends RearSeat
{
	public Codrac_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac rear seats";
		description = "Stock rear seats for Codrac models.";

		value = tHUF2USD(109.72);
		brand_new_prestige_value = 29.50;
	}
}
