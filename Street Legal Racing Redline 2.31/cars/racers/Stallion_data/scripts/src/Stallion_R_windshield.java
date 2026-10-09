package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_windshield extends Windshield
{
	public Stallion_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion rear windshield";
		description = "Stock rear windshield for Stallion models.";

		value = tHUF2USD(186.524);
		brand_new_prestige_value = 31.82;
	}
}
