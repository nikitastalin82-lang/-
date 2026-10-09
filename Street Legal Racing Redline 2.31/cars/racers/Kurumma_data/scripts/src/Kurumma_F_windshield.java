package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_F_windshield extends Windshield
{
	public Kurumma_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma front windshield";
		description = "Stock front windshield for Kurumma models.";

		value = tHUF2USD(152.131);
		brand_new_prestige_value = 31.82;
	}
}
