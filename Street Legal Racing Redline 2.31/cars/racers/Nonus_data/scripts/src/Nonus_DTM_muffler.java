package java.game.cars;

import java.game.parts.enginepart.*;

public class Nonus_DTM_muffler extends ExhaustTip
{
	public Nonus_DTM_muffler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM muffler";
		description = "The stock muffler for the side exhaust system of Emer Nonus DTM.";

		value = tHUF2USD(983.500);
		brand_new_prestige_value = 35.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
