package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_trunk_2 extends Trunk
{
	public Baiern_trunk_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM trunk door";

		description = "The light smoothed trunk door for the CoupeSport DTM. Nice looking and highly durable this trunk door ensures the safety of inside parts even in very tough racing conditions. But CoupeSport/DevilSport chassis compatibility makes it useful for street racers that would be happy to get some part of a true racing machine in their tuning cars.";

		value = tHUF2USD(1835.7);
		brand_new_prestige_value = 41.50;
		setMaxWear(kmToMaxWear(300000.0));
	}
}
