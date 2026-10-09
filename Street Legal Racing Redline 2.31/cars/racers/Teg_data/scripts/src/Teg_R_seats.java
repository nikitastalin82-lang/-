package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_seats extends RearSeat
{
	public Teg_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg rear seats";
		description = "Stock rear seats for Teg models.";

		value = tHUF2USD(66.676);
		brand_new_prestige_value = 31.34;
	}
}
