package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_windshield extends Windshield
{
	public Remo_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo rear windshield";
		description = "Stock rear windshield for Remo models.";

		value = tHUF2USD(169.222);
		brand_new_prestige_value = 20.25;
	}
}
