package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_seats extends RearSeat
{
	public Coyot_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot rear seats";
		description = "Stock rear seats for Coyot models.";

		value = tHUF2USD(109.72);
		brand_new_prestige_value = 33.18;
	}
}
