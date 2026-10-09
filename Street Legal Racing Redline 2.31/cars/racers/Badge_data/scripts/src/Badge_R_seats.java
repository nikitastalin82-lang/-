package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_seats extends RearSeat
{
	public Badge_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge rear seats";
		description = "Stock rear seats for Badge models.";

		value = tHUF2USD(69.208);
		brand_new_prestige_value = 40.56;
	}
}
