package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_RL_blinker extends Taillights
{
	public Codrac_RL_blinker( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac rear left blinker";
		description = "Stock left taillight component for Codrac models.";

		value = tHUF2USD(65.621);
		brand_new_prestige_value = 23.14;
	}
}
