package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_RL_window extends Window
{
	public Kurumma_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma rear left window";
		description = "Stock rear left window for Kurumma models.";

		value = tHUF2USD(57.603);
		brand_new_prestige_value = 26.99;
	}
}
