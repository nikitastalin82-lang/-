package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_RL_window extends Window
{
	public Ninja_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja rear left window";
		description = "Stock rear left window for Ninja models.";

		value = tHUF2USD(51.484);
		brand_new_prestige_value = 18.40;
	}
}
