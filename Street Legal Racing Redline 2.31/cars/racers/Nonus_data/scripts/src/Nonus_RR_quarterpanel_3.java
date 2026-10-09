package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_RR_quarterpanel_3 extends Quarterpanel
{
	public Nonus_RR_quarterpanel_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM rear right quarterpanel";
		description = "A wided light-alloy rear right quarterpanel for the Nonus DTM. It has gained an airduct for cooling the rear brakes.";
		brand_new_prestige_value = 83.50;

		value = tHUF2USD(3449.85);
	}
}
