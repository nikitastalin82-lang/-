package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_wing extends Wing
{
	public Furrano_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano rear wing";

		description = "Stock rear wing for Furrano models.";

		value = tHUF2USD(350.000);
		brand_new_prestige_value = 69.03;
		setMaxWear(kmToMaxWear(400000.0));
	}
}