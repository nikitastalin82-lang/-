package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_RR_quarterpanel_2 extends Quarterpanel
{
	public Focer_RR_quarterpanel_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer WRC rear right quarterpanel";
		description = "Stock rear right quarterpanel for the Focer WRC";
		brand_new_prestige_value = 34.10;

		value = tHUF2USD(346.04);
	}
}
