package java.game.cars;

import java.game.parts.enginepart.*;

public class Baiern_DTM_muffler extends ExhaustTip
{
	public Baiern_DTM_muffler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM muffler";
		description = "The stock muffler for the side exhaust system of Baiern CoupeSport DTM.";

		value = tHUF2USD(1123.320);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
