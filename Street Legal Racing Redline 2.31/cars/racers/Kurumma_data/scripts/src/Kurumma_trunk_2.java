package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_trunk_2 extends Trunk
{
	public Kurumma_trunk_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z35C trunk";
		description = "Stock trunk for the Kurumma Z35C.";

		value = tHUF2USD(195.808);
		brand_new_prestige_value = 44.31;
	}
}
