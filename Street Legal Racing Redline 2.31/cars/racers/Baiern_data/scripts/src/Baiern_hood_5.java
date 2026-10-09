package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_hood_5 extends Hood
{
	public Baiern_hood_5( int id )
	{
		super( id );

		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM hood";

		description = "The hood of the CoupeSport DTM. Based on the SL tuners custom hood for the DevilSport model, it's made from carbon fiber and gained an extended air output socket, which allows to put a supercharged V8 engine under the hood.";

		value = tHUF2USD(5021.8);
		brand_new_prestige_value = 90.0;
		setMaxWear(kmToMaxWear(600000.0));
	}
}
