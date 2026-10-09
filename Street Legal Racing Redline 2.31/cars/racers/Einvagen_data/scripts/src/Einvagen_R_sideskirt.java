package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_sideskirt extends Sideskirt
{
	public Einvagen_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM right sideskirt";

		description = "A large aerodynamic sideskirt for Einvagen 140 DTM.";

		value = tHUF2USD(3027.85);
		brand_new_prestige_value = 73.0;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
