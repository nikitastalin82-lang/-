package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_trunk_3 extends Trunk
{
	public Kurumma_trunk_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma custom trunk";
		description = "Custom trunk for Kurumma models.";

		value = tHUF2USD(254.677);
		brand_new_prestige_value = 55.29;
	}
}
