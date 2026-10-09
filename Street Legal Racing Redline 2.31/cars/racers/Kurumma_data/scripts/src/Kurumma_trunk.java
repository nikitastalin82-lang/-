package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_trunk extends Trunk
{
	public Kurumma_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z3 trunk";
		description = "Stock trunk for the Kurumma Z3.";

		value = tHUF2USD(124.701);
		brand_new_prestige_value = 26.99;
	}
}
