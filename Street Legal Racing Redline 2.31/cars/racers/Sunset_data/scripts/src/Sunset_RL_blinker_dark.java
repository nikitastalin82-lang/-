package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_RL_blinker_dark extends Taillights
{
	public Sunset_RL_blinker_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset dark rear left blinker";
		description = "Dark left taillights components for Sunset models.";

		value = tHUF2USD(75);
		brand_new_prestige_value = 28.04;
	}
}
