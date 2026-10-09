package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_F_bumper_5 extends Bumper
{
	public Einvagen_F_bumper_5( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM front bumper";
		description = "Front bumper for Einvagen 140 DTM. It has a large ariduct and additional aerodynamic components, what in complex makes it optimal for comfortable racing in DTM.";

		value = tHUF2USD(3027.85);
		brand_new_prestige_value = 110.00;
	}
}
