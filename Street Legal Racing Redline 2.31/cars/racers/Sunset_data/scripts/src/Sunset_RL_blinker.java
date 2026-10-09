package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_RL_blinker extends Taillights
{
	public Sunset_RL_blinker( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset rear left blinker";
		description = "Stock left taillights components for Sunset models.";

		value = tHUF2USD(73.006);
		brand_new_prestige_value = 26.04;
	}
}
