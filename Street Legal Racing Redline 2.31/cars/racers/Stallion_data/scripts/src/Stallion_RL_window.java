package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_RL_window extends Window
{
	public Stallion_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion rear left window";
		description = "Stock rear left window for Stallion models.";

		value = tHUF2USD(69.63);
		brand_new_prestige_value = 26.99;
	}
}
