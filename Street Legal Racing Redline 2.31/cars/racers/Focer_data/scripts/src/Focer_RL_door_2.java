package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_RL_door_2 extends RearDoor
{
	public Focer_RL_door_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer WRC rear left door";
		description = "Stock rear left door for the Focer WRC";
		brand_new_prestige_value = 45.11;

 		value = tHUF2USD(192.221);
	}
}
