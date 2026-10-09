package java.game.cars;

import java.game.parts.enginepart.*;

public class Einvagen_DTM_muffler extends ExhaustTip
{
	public Einvagen_DTM_muffler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM muffler";
		description = "The stock muffler for the side exhaust system of Einvagen 140 DTM.";

		value = tHUF2USD(887.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
