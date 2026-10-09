package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_windshield extends Windshield
{
	public Kurumma_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma rear windshield";
		description = "Stock rear windshield for Kurumma models.";

		value = tHUF2USD(180.324);
		brand_new_prestige_value = 31.82;
	}
}
