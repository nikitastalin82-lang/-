package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_windshield extends Windshield
{
	public Teg_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg rear windshield";
		description = "Stock rear windshield for Teg models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 24.59;
	}
}
