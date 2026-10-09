package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_seats extends RearSeat
{
	public ST9_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 rear seats";
		description = "Stock rear seats for ST9 models.";

		value = tHUF2USD(107.61);
		brand_new_prestige_value = 38.71;
	}
}
