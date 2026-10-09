package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_seats extends RearSeat
{
	public Stallion_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion rear seats";
		description = "Stock rear seats for Stallion models.";

		value = tHUF2USD(90.097);
		brand_new_prestige_value = 40.56;
	}
}
